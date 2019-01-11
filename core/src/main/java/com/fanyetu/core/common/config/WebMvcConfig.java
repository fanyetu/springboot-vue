package com.fanyetu.core.common.config;

import com.fanyetu.core.auth.resolver.CurrentUserIsAdminWebArgumentResolver;
import com.fanyetu.core.auth.resolver.CurrentUserWebArgumentResolver;
import com.fanyetu.core.common.exception.CommonExceptionResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author zhanghaonan
 * @date 2018/11/28
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private CommonExceptionResolver commonExceptionResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new CurrentUserWebArgumentResolver());
        resolvers.add(new CurrentUserIsAdminWebArgumentResolver());
    }

    /**
     * 配置统一异常处理器
     * @param resolvers
     */
    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(commonExceptionResolver);
    }
}
