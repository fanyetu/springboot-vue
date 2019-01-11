import {codeTable} from "../api/config"
import {homeRouter} from "../router"
import {MessageBox} from 'element-ui'
import http from './http'

/**
 * 初始化菜单
 * @param router
 * @param store
 * @param menus
 */
export function initMenu(router, store) {
    getMenus(store)
        .then((menus) => {
            // debugger
            store.commit('setMenus', menus)
            // 添加home路由
            homeRouter.children = formatRoute(menus)
            homeRouter.name = '动态主页'

            // console.log(homeRouter)
            router.addRoutes([homeRouter])
        })
        .catch((e) => {
            MessageBox.alert('菜单加载失败，请稍后重试')
        })
}

async function getMenus(store) {
    if (store.getters.menus.length > 0) {
        return store.getters.menus
    }

    try {
        return await http.get('/menu/tree')
    }catch (e) {
        throw e
    }
}

function formatRoute(routes) {
    let fmtRoutes = []
    routes.forEach((route) => {
        let {
            path,
            component,
            name,
            keepAlive,
            requireAuth,
            iconCls,
            children
        } = route

        if (children && children instanceof Array) {
            children = formatRoute(children)
        }

        let fmtRoute = {
            path,
            name,
            meta: {
                keepAlive: keepAlive === codeTable.TRUE,
                requireAuth: requireAuth === codeTable.TRUE
            },
            iconCls,
            children,
            component(resolve) {
                require(['../components/' + component + '.vue'], resolve)
            }
        }

        fmtRoutes.push(fmtRoute)
    })

    return fmtRoutes;
}
