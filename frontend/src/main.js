import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import {sync} from 'vuex-router-sync'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import '@/common/less/index.less'

Vue.use(ElementUI)

Vue.config.productionTip = false

// 使用vuex-router-sync关联router和store
sync(store, router)

new Vue({
    router,
    store,
    render: h => h(App),
}).$mount('#app')
