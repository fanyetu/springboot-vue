package com.fanyetu.core.auth.custom;

import com.fanyetu.core.auth.entity.User;
import com.fanyetu.core.auth.util.SecurityContextUtil;
import com.fanyetu.core.common.result.Result;
import com.fanyetu.core.common.result.ResultGenerator;
import com.fanyetu.core.common.util.HttpResponseUtil;
import com.fanyetu.core.common.util.JacksonUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录成功处理
 *
 * @author zhanghaonan
 * @date 2018/11/28
 */
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

//    private JwtProperties jwtProperties;

//    public CustomAuthenticationSuccessHandler(JwtProperties jwtProperties) {
//        this.jwtProperties = jwtProperties;
//    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        // TODO 不使用jwt，直接使用session
        /*// 生成jwt token
        String token = Jwts.builder()
                .setSubject(((CustomUserDetails) authentication.getPrincipal()).getUsername())
                .setExpiration(new Date(System.currentTimeMillis() + (jwtProperties.getExpired() * 1000)))
                .signWith(SignatureAlgorithm.HS512, jwtProperties.getSecret())
                .compact();
        // 放到response header中
        response.setHeader(jwtProperties.getHeader(), jwtProperties.getPrefix() + token);*/

        User currentUser = SecurityContextUtil.getCurrentUser();
        if (currentUser != null) {
            currentUser.setPassword(null);
        }
        Result result = ResultGenerator.genSuccessResult("登录成功", currentUser);
        HttpResponseUtil.writeSuccessJson(response, JacksonUtil.objectToJSON(result));
    }
}
