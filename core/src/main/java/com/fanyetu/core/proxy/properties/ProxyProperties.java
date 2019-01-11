package com.fanyetu.core.proxy.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhanghaonan
 * @date 2018/12/6
 */
@ConfigurationProperties("elk.proxy")
@Getter
@Setter
public class ProxyProperties {

    private String host = "127.0.0.1";

    private int port = 8088;

}
