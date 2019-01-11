package com.fanyetu.core.auth.resolver;

import cn.hutool.core.util.ArrayUtil;
import com.fanyetu.core.auth.custom.CustomUserDetails;
import com.fanyetu.core.auth.entity.User;
import com.fanyetu.core.auth.util.SecurityContextUtil;
import org.springframework.core.MethodParameter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Optional;

import static com.fanyetu.core.auth.custom.CustomUserDetails.ADMIN_ROLE;

/**
 * @author zhanghaonan
 * @date 2018/12/3
 */
public class CurrentUserIsAdminWebArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        Annotation[] parameterAnnotations = methodParameter.getParameterAnnotations();

        if (ArrayUtil.isEmpty(parameterAnnotations)) {
            return false;
        }

        if (!Boolean.class.equals(methodParameter.getParameterType())) {
            return false;
        }

        for (Annotation parameterAnnotation : parameterAnnotations) {
            if (CurrentUserIsAdmin.class.equals(parameterAnnotation.annotationType())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Optional<CustomUserDetails> currentUserDetails = SecurityContextUtil.getCurrentUserDetails();
        return currentUserDetails.<Object>map(CustomUserDetails::isAdmin).orElse(Boolean.FALSE);
    }
}
