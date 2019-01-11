package com.fanyetu.core.auth.custom;

import com.fanyetu.core.auth.entity.User;
import com.fanyetu.core.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhanghaonan
 * @date 2018/11/26
 */
@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.queryByUsernameWithPassword(username);
        if (user == null) {
            throw new UsernameNotFoundException("未找到该用户");
        }
        return new CustomUserDetails(user);
    }
}
