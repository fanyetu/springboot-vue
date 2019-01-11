package com.fanyetu.core.auth.service.impl;

import com.fanyetu.core.auth.entity.Role;
import com.fanyetu.core.auth.mapper.RoleMapper;
import com.fanyetu.core.auth.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhanghaonan
 * @date 2018/12/4
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> queryAll() {
        return roleMapper.queryAll();
    }
}
