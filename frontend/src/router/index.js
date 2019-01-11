import Vue from 'vue'
import VueRouter from 'vue-router'
import store from '../store'
import {initMenu} from "../common/utils"

const Login = () => import('@/components/login/login')
const Home = () => import('@/components/home/home')

Vue.use(VueRouter)

export const homeRouter = {
    path: '/home',
    name: '主页',
    component: Home,
    meta: {
        requireAuth: true
    }
}

let router = new VueRouter({
    routes: [
        {
            path: '/',
            name: 'login',
            component: Login
        },
        homeRouter
    ]
})

router.beforeEach((to, from, next) => {
    if (to.matched.some(record => record.meta.requireAuth === true)) {
        if (!store.getters.logined) {
            next({
                path: '/'
            })
            return
        }
    }

    let path = to.path
    if (path === '/') {
        if (store.getters.logined) {
            next({
                path: '/home'
            })
            return
        }
    }

    // 如果已经登录，并且是刷新页面来的，那么重新初始化菜单，因为刷新菜单会重置router
    if (store.getters.logined && isRefresh(from)) {
        // 初始化菜单
        initMenu(router, store)
    }

    next()
})

function isRefresh(from) {
    return !from.name && from.path === '/'
}

export default router
