package com.fanyetu.core.auth.config;

import com.fanyetu.core.auth.controller.LoginController;
import com.fanyetu.core.auth.custom.*;
import com.fanyetu.core.auth.properties.JwtProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanghaonan
 * @date 2018/11/28
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private CustomSecurityMetadataSource customSecurityMetadataSource;

    @Autowired
    private CustomAccessDecisionManager customAccessDecisionManager;

    @Autowired
    private CustomAccessDeniedHandler customAccessDeniedHandler;

    /**
     * 身份验证
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 登录时使用加盐进行摘要计算
        auth.userDetailsService(customUserDetailsService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    /**
     * web安全
     *
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        // 这些请求都不做安全控制
        web.ignoring().antMatchers("/index.html", "/js/**", "/css/**", "fonts/**", "favicon.ico",
                LoginController.REQUIRE_LOGIN_URL, "/error");
    }

    /**
     * http请求安全处理
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
                    @Override
                    public <O extends FilterSecurityInterceptor> O postProcess(O object) {
                        object.setSecurityMetadataSource(customSecurityMetadataSource);
                        object.setAccessDecisionManager(customAccessDecisionManager);
                        return object;
                    }
                })
                .and()
                .formLogin()
                // 指定登录页面（这里因为是前后端分离的，所以这里的loginPage实际上就返回的需要登录的提示）
                .loginPage(LoginController.REQUIRE_LOGIN_URL)
                // 指定登录请求地址
                .loginProcessingUrl(LoginController.LOGIN_URL)
                // 指定登录请求参数
                .usernameParameter("username").passwordParameter("password")
                // 配置登录成功失败后的操作
                .failureHandler(new CustomAuthenticationFailureHandler())
                .successHandler(new CustomAuthenticationSuccessHandler())
                // 全部允许访问（通过CustomSecurityMetadataSource类动态拦截url）
                .permitAll()
                .and()
                .logout().permitAll()
                .and()
                // 关闭csrf，csrf和restful方式的接口存在冲突（https://blog.csdn.net/u012373815/article/details/55047285）
                .csrf().disable()
                // 自定义403返回
                .exceptionHandling().accessDeniedHandler(customAccessDeniedHandler);
//                .and()
                // 配置无状态，不使用session
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//                .and()
//                .addFilter(new CustomUsernamePasswordAuthenticationFilter(authenticationManager()));

    }
}
