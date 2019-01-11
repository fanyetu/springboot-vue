package com.fanyetu.core.auth.controller;

import com.fanyetu.core.auth.dto.SignUpUserDto;
import com.fanyetu.core.auth.entity.User;
import com.fanyetu.core.auth.service.UserService;
import com.fanyetu.core.common.result.Result;
import com.fanyetu.core.common.result.ResultGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册controller
 *
 * @author zhanghaonan
 * @date 2018/11/29
 */
@RestController
public class SignUpController {

    @Autowired
    private UserService userService;

    @PostMapping("/signUp")
    public Result signUp(@RequestBody SignUpUserDto param){
        User user = new User();
        BeanUtils.copyProperties(param, user);

        boolean b = userService.signUp(user);

        return b ? ResultGenerator.genSuccessResult("注册成功")
                : ResultGenerator.genFailureResult("注册失败");
    }
}
