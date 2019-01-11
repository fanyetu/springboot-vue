package com.fanyetu.core.auth.service;

import com.fanyetu.core.auth.entity.Menu;
import com.fanyetu.core.auth.entity.Role;
import com.fanyetu.core.auth.vo.MenuVo;

import java.util.List;

/**
 * @author zhanghaonan
 * @date 2018/11/30
 */
public interface MenuService {
    List<MenuVo> queryMenuTreeByRoles(List<Role> roles);

    List<MenuVo> convertMenuListToTree(List<Menu> menus);

    List<MenuVo> queryAllMenuTree();

}
