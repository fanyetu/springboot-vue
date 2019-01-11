package com.fanyetu.core.auth.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fanyetu.core.auth.entity.Role;
/**
*  @author zhanghaonan
*/
public interface RoleBaseMapper {

    int insertRole(Role object);

    int updateRole(Role object);

    int update(Role.UpdateBuilder object);

    List<Role> queryRole(Role object);

    Role queryRoleLimit1(Role object);

}