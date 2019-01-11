package com.fanyetu.core.auth.mapper;

import com.fanyetu.core.auth.entity.User;
import com.fanyetu.core.auth.mapper.base.UserBaseMapper;
import org.apache.ibatis.annotations.Param;

/**
*  @author zhanghaonan
*/
public interface UserMapper extends UserBaseMapper{

    User queryByUsername(@Param("username") String username);

}