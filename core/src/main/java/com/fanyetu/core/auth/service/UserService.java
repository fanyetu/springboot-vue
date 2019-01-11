package com.fanyetu.core.auth.service;

import com.fanyetu.core.auth.entity.User;

/**
 * @author zhanghaonan
 * @date 2018/11/29
 */
public interface UserService {
    User queryByUsernameWithPassword(String username);

    User queryByUsername(String username);

    boolean signUp(User user);
}
