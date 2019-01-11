package com.fanyetu.core.common.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhanghaonan
 * @date 2018/12/3
 */
@Data
@Builder
public class ConfigEntity {

    private String key;

    private String value;
}
