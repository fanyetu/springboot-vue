package com.fanyetu.core.common.service;

import com.fanyetu.core.common.entity.ConfigEntity;

/**
 * @author zhanghaonan
 * @date 2018/12/3
 */
public interface ConfigService {
    String queryValueByKey(String key);

    void insertConfig(ConfigEntity config);
}
