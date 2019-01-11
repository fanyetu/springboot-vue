/**
 * 后台服务器基础url
 * @type {string}
 */
export const BASE_URL = process.env.BASE_URL

export const ES_URL = process.env.VUE_APP_ES_URL

export const resultCode = {
    SUCCESS: 200, // 成功
    FAIL: 400, // 失败
    UNAUTHORIZED: 401, // 未认证
    FORBIDDEN: 403, // 拒绝访问（权限不足）
    NOT_FOUND: 404, // 接口不存在
    INTERNAL_SERVER_ERROR: 500 // 服务器内部错误
}

export const codeTable = {
    TRUE: 1,
    FALSE: 0
}
