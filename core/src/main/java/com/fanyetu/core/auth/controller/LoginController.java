package com.fanyetu.core.auth.controller;

import com.fanyetu.core.common.result.Result;
import com.fanyetu.core.common.result.ResultCode;
import com.fanyetu.core.common.result.ResultGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghaonan
 * @date 2018/11/28
 */
@RestController
public class LoginController {

    public static final String REQUIRE_LOGIN_URL = "/login_p";

    public static final String LOGIN_URL = "/login";

    @GetMapping(REQUIRE_LOGIN_URL)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public Result login() {
        return ResultGenerator.genResult(ResultCode.UNAUTHORIZED, "您还未登录，请先登录");
    }
}
