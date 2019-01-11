
import axios from 'axios'
import { BASE_URL, resultCode } from '@/api/config'
import {Message, MessageBox} from 'element-ui'
import router from '../router'
import store from '../store'

let CancelToken = axios.CancelToken

let promiseArr = {}
const DELAY_TIME = 30000

let options = {
    baseURL: BASE_URL, // 基础的url，配置在api/config.js文件中
    timeout: DELAY_TIME
}

let instance = axios.create(options)

// 通用处理请求
instance.interceptors.request.use((config) => {
    // 重复提交拦截
    let source = CancelToken.source()
    config.cancelToken = source.token

    let now = new Date().getTime()
    let req = promiseArr[config.url]
    if (req) {
        if (req.setTime + DELAY_TIME > now) {
            source.cancel('取消重复请求')
        } else {
            delete promiseArr[config.url]
        }
    } else {
        promiseArr[config.url] = {
            setTime: new Date().getTime()
        }
    }

    return config
}, (error) => {
    console.error(error)
    return Promise.reject(error)
})

// 通用处理返回
instance.interceptors.response.use((response) => {
    // 删除重复请求拦截
    delete promiseArr[response.config.url]

    // 处理成功逻辑
    let result = response.data
    // 判断返回值的code
    switch (result.code) {
        case resultCode.SUCCESS:
            return Promise.resolve(result.data)
        default:
            return Promise.reject(result)
    }
}, (error) => {
    if (axios.isCancel(error)) {
        console.log('request canceled: ' + error.message)
    } else {
        // 删除重复请求拦截
        delete promiseArr[error.config.url]

        let data = error.response.data
        switch (data.code) {
            case resultCode.FAIL:
                Message.error(data.msg)
                return Promise.reject(error)
            case resultCode.INTERNAL_SERVER_ERROR:
            case resultCode.NOT_FOUND:
                Message.error('请求失败，请稍后重试，错误码:' + data.code)
                return Promise.reject(error)
            case resultCode.FORBIDDEN:
                Message.warning('权限不足，请联系管理员')
                return Promise.reject(error)
            case resultCode.UNAUTHORIZED:
                store.dispatch('logout')
                MessageBox.alert(data.msg, '提示')
                    .then(() => {
                        router.push('/')
                    })
                return Promise.reject(error)
            default:
                return Promise.reject(error)
        }
    }
})

function Http () {}

Http.prototype = instance
Http.prototype.constructor = Http

let http = new Http()

export default http
