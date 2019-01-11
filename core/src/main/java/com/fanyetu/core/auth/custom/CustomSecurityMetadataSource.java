package com.fanyetu.core.auth.custom;

import com.fanyetu.core.auth.entity.Menu;
import com.fanyetu.core.auth.entity.Role;
import com.fanyetu.core.auth.mapper.MenuMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.fanyetu.core.auth.custom.CustomUserDetails.ADMIN_ROLE;

/**
 * 仿造DefaultFilterInvocationSecurityMetadataSource实现类
 * 动态定义程序中安全的url
 * 主要功能就是通过当前的请求地址，获取该地址需要的用户角色
 * 此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 decide 方法，用来判定用户是否有此权限。如果不在权限表中则放行。
 * <p>
 * 官方文档
 * https://docs.spring.io/spring-security/site/docs/5.2.0
 * .BUILD-SNAPSHOT/reference/htmlsingle/#appendix-faq-dynamic-url-metadata
 *
 * @author zhanghaonan
 * @date 2018/11/26
 */
@Slf4j
@Component
public class CustomSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    public static final String ROLE_LOGIN = "ROLE_LOGIN";

    @Autowired
    private MenuMapper menuMapper;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        List<Menu> menus = menuMapper.queryAll();

        for (Menu menu : menus) {
            List<Role> roles = menu.getRoles();
            // 添加管理员权限（管理员可访问所有菜单）
            roles.add(Role.Build().name(ADMIN_ROLE).build());

            if (antPathMatcher.match(menu.getUrl(), requestUrl)) {
                List<String> roleNameList = roles.stream().map(Role::getName).collect(Collectors.toList());

                return SecurityConfig.createList(roleNameList.toArray(new String[0]));
            }
        }

        return SecurityConfig.createList(ROLE_LOGIN);
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
