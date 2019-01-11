package com.fanyetu.core.common.result;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {

	/**
	 * 成功
	 */
	SUCCESS(200),

	/**
	 * 失败
	 */
	FAIL(400),

	/**
	 * 未认证
	 */
	UNAUTHORIZED(401),

	/**
	 * 拒绝访问
	 */
	FORBIDDEN(403),

	/**
	 * 接口不存在
	 */
	NOT_FOUND(404),

	/**
	 * 超出流量控制
	 */
	FLOW_OUT_ERROR(425),

	/**
	 * 服务器内部错误
	 */
	INTERNAL_SERVER_ERROR(500);

	public int code;

	ResultCode(int code) {
		this.code = code;
	}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
