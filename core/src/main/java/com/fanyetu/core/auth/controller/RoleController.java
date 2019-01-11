package com.fanyetu.core.auth.controller;

import com.fanyetu.core.auth.service.RoleService;
import com.fanyetu.core.common.result.Result;
import com.fanyetu.core.common.result.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghaonan
 * @date 2018/12/4
 */
@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/queryAll")
    public Result queryAllRoles(){
        return ResultGenerator.genSuccessResult(roleService.queryAll());
    }
}
