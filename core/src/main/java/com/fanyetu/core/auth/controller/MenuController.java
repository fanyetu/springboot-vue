package com.fanyetu.core.auth.controller;

import com.fanyetu.core.auth.entity.User;
import com.fanyetu.core.auth.resolver.CurrentUser;
import com.fanyetu.core.auth.resolver.CurrentUserIsAdmin;
import com.fanyetu.core.auth.service.MenuService;
import com.fanyetu.core.auth.vo.MenuVo;
import com.fanyetu.core.common.result.Result;
import com.fanyetu.core.common.result.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhanghaonan
 * @date 2018/11/30
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/tree")
    public Result getMenuTreeByUser(@CurrentUser User user, @CurrentUserIsAdmin Boolean isAdmin) {
        List<MenuVo> menuVos;
        if (isAdmin){
            menuVos = menuService.queryAllMenuTree();
        }else {
            menuVos = menuService.queryMenuTreeByRoles(user.getRoles());
        }
        return ResultGenerator.genSuccessResult(menuVos);
    }
}
