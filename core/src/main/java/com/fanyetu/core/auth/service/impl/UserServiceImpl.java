package com.fanyetu.core.auth.service.impl;

import com.fanyetu.core.auth.entity.User;
import com.fanyetu.core.auth.mapper.UserMapper;
import com.fanyetu.core.auth.service.UserService;
import com.fanyetu.core.common.constant.CommonConstant;
import com.fanyetu.core.common.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author zhanghaonan
 * @date 2018/11/29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByUsernameWithPassword(String username){
        return userMapper.queryByUsername(username);
    }

    @Override
    public User queryByUsername(String username){
        User user = userMapper.queryByUsername(username);
        // 不返回password
        user.setPassword(null);
        return user;
    }

    @Override
    public boolean signUp(User user) {
        User row = userMapper.queryByUsername(user.getUsername());
        if (row != null){
            throw new ServiceException("用户名已被注册，请更换用户名");
        }

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String result = bCryptPasswordEncoder.encode(user.getPassword());

        user.setPassword(result);
        user.setEnable(CommonConstant.TRUE);
        int i = userMapper.insertUser(user);
        return i > 0;
    }

}
