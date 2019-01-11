package com.fanyetu.core.auth.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhanghaonan
 * @date 2018/11/29
 */
@Deprecated
//@ConfigurationProperties(prefix = "com.fanyetu.jwt")
//@Getter
//@Setter
public class JwtProperties {

    private Long expired = 30L * 60;

    private String secret;

    private String header = "Authorization";

    private String prefix = "Bearer ";
}
