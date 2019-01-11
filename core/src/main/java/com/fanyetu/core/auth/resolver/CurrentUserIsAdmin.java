package com.fanyetu.core.auth.resolver;

import java.lang.annotation.*;

/**
 * @author zhanghaonan
 * @date 2018/12/3
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUserIsAdmin {
}
