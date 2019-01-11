package com.fanyetu.core.auth.util;

import com.fanyetu.core.auth.custom.CustomUserDetails;
import com.fanyetu.core.auth.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

/**
 * @author zhanghaonan
 * @date 2018/11/30
 */
public class SecurityContextUtil {

    /**
     * 获取当前登录用户
     * @return
     */
    public static Optional<CustomUserDetails> getCurrentUserDetails(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null){
            return Optional.empty();
        }

        Object principal = authentication.getPrincipal();

        if (principal instanceof CustomUserDetails) {
            CustomUserDetails customUserDetails = (CustomUserDetails) principal;
            return Optional.of(customUserDetails);
        }

        return Optional.empty();
    }

    /**
     * 获取当前登录用户
     *
     * @return
     */
    public static User getCurrentUser() {
        Optional<CustomUserDetails> currentUserDetails = getCurrentUserDetails();
        return currentUserDetails.map(CustomUserDetails::getUser).orElse(null);
    }
}
