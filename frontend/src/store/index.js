import Vue from 'vue'
import Vuex from 'vuex'
import createLogger from 'vuex/dist/logger'
import createPersistedState from 'vuex-persistedstate'
import router from '../router'

Vue.use(Vuex)

// 如果不是生产环境则开启debug
const debug = process.env.NODE_ENV !== 'production'

export default new Vuex.Store({
    state() {
        return {
            logined: false,
            userInfo: null,
            menus: []
        }
    },
    getters: {
        logined(state) {
            return state.logined
        },
        userInfo(state) {
            return state.userInfo
        },
        menus(state){
            return state.menus
        }
    },
    mutations: {
        setLogined(state, logined) {
            state.logined = logined
        },
        setUserInfo(state, userInfo) {
            state.userInfo = userInfo
        },
        setMenus(state, menus){
            state.menus = menus
        }
    },
    actions:{
        login({commit}, userInfo){
            commit('setLogined', true)
            commit('setUserInfo', userInfo)
        },
        logout({commit}){
            commit('setLogined', false)
            commit('setUserInfo', null)
            commit('setMenus', [])
            router.push('/')
        }
    },
    strict: debug, // 开启vuex严格模式，只能通过mutations的方式修改state
    // 在debug模式下启用logger插件，打印vuex的状态信息，存储vuex的信息到sessionStorage中
    plugins: debug ? [createLogger(), createPersistedState({storage: window.sessionStorage})]
        : [createPersistedState({storage: window.sessionStorage})]
})
