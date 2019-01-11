package com.fanyetu.core.auth.custom;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

import static com.fanyetu.core.auth.custom.CustomSecurityMetadataSource.ROLE_LOGIN;

/**
 * CustomSecurityMetadataSource getAttributes(Object o)方法返回的集合最终会来到AccessDecisionManager类中
 * 方法是判定是否拥有权限的决策方法
 *
 * 官网
 * https://docs.spring.io/spring-security/site/docs/5.2.0.BUILD-SNAPSHOT/reference/htmlsingle/#ns-access-manager
 *
 * @author zhanghaonan
 * @date 2018/11/28
 */
@Component
public class CustomAccessDecisionManager implements AccessDecisionManager {

    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection)
            throws AccessDeniedException, InsufficientAuthenticationException {
        for (ConfigAttribute ca : collection) {
            // 当前请求需要的权限
            String need = ca.getAttribute();

            if (ROLE_LOGIN.equals(need)) {
                if (authentication instanceof AnonymousAuthenticationToken) {
                    throw new BadCredentialsException("未登录");
                } else {
                    return;
                }
            }

            // 当前用户所具有的权限
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            for (GrantedAuthority authority : authorities) {
                if (need.equals(authority.getAuthority())) {
                    return;
                }
            }
        }

        throw new AccessDeniedException("权限不足");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return false;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
