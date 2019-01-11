package com.fanyetu.core.auth.mapper;

import com.fanyetu.core.auth.entity.Role;
import com.fanyetu.core.auth.mapper.base.RoleBaseMapper;

import java.util.List;

/**
*  @author zhanghaonan
*/
public interface RoleMapper extends RoleBaseMapper{

    List<Role> queryAll();
}