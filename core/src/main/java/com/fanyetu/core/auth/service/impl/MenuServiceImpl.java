package com.fanyetu.core.auth.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.fanyetu.core.auth.entity.Menu;
import com.fanyetu.core.auth.entity.Role;
import com.fanyetu.core.auth.mapper.MenuMapper;
import com.fanyetu.core.auth.service.MenuService;
import com.fanyetu.core.auth.vo.MenuVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhanghaonan
 * @date 2018/11/30
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuVo> queryMenuTreeByRoles(List<Role> roles) {
        List<Integer> roleIds = roles.stream().map(Role::getId).collect(Collectors.toList());
        List<Menu> menus = menuMapper.queryMenuListByRoles(roleIds);

        return convertMenuListToTree(menus);
    }

    @Override
    public List<MenuVo> convertMenuListToTree(List<Menu> menus) {
        return convertMenuListToTree(null, menus);
    }

    @Override
    public List<MenuVo> queryAllMenuTree() {
        List<Menu> menus = menuMapper.queryAll();
        return convertMenuListToTree(menus);
    }

    private List<MenuVo> convertMenuListToTree(Integer parentId, List<Menu> menus) {
        if (CollectionUtil.isEmpty(menus)) {
            return null;
        }

        List<MenuVo> result = new ArrayList<>();

        for (Menu menu : menus) {
            boolean equals = (menu.getParentId() == null && parentId == null) ||
                    (menu.getParentId() != null && menu.getParentId().equals(parentId));
            if (equals){
                MenuVo menuVo = new MenuVo();
                BeanUtils.copyProperties(menu, menuVo);
                menuVo.setChildren(convertMenuListToTree(menu.getId(), menus));

                result.add(menuVo);
            }
        }

        return result;
    }
}
