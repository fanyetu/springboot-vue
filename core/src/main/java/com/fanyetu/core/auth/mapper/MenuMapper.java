package com.fanyetu.core.auth.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fanyetu.core.auth.entity.Menu;
import com.fanyetu.core.auth.mapper.base.MenuBaseMapper;
/**
*  @author zhanghaonan
*/
public interface MenuMapper extends MenuBaseMapper{

    List<Menu> queryAll();

    List<Menu> queryMenuListByRoles(@Param("roleIds") List<Integer> roleIds);
}