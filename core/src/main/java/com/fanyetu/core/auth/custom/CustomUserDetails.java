package com.fanyetu.core.auth.custom;

import com.fanyetu.core.auth.entity.Role;
import com.fanyetu.core.auth.entity.User;
import com.fanyetu.core.common.constant.CommonConstant;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author zhanghaonan
 * @date 2018/11/28
 */
public class CustomUserDetails implements UserDetails {

    public static final String ADMIN_USERNAME = "admin";

    public static final String ADMIN_ROLE = "ROLE_ADMIN";

    private User user;

    public CustomUserDetails(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public boolean isAdmin(){
        Collection<? extends GrantedAuthority> authorities = this.getAuthorities();

        for (GrantedAuthority authority : authorities) {
            if (ADMIN_ROLE.equals(authority.getAuthority())) {
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();

        // 如果用户是管理员则设置管理员权限
        if (ADMIN_USERNAME.equals(this.user.getUsername())) {
            authorities.add(new SimpleGrantedAuthority(ADMIN_ROLE));
        }

        for (Role role : this.user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    /**
     * 账户是否过期
     *
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 账户是否锁定
     *
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 凭证是否过期
     *
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 是否可用
     *
     * @return
     */
    @Override
    public boolean isEnabled() {
        return this.user.getEnable().equals(CommonConstant.TRUE);
    }
}
