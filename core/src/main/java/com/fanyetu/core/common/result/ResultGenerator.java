package com.fanyetu.core.common.result;

/**
 * @author zhanghaonan
 * @date 2018/11/28
 */
public class ResultGenerator {

    public static Result getUnauthorizedResult(String msg) {
        return genResult(ResultCode.UNAUTHORIZED, msg, null);
    }

    public static Result genFailureResult(String msg) {
        return genResult(ResultCode.FAIL, msg, null);
    }

    public static Result genResult(ResultCode resultCode, String msg) {
        return genResult(resultCode, msg, null);
    }

    public static Result genResult(ResultCode resultCode, String msg, Object data) {
        return Result.builder()
                .code(resultCode.getCode())
                .msg(msg)
                .data(data)
                .build();
    }

    public static Result genSuccessResult(Object data) {
        return genSuccessResult(ResultCode.SUCCESS.name(), data);
    }

    public static Result genSuccessResult() {
        return genSuccessResult(ResultCode.SUCCESS.name());
    }

    public static Result genSuccessResult(String msg) {
        return genSuccessResult(msg, null);
    }

    public static Result genSuccessResult(String msg, Object data) {
        return genResult(ResultCode.SUCCESS, msg, data);
    }
}
