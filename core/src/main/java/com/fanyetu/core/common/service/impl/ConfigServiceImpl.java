package com.fanyetu.core.common.service.impl;

import com.fanyetu.core.common.entity.ConfigEntity;
import com.fanyetu.core.common.exception.ServiceException;
import com.fanyetu.core.common.mapper.ConfigMapper;
import com.fanyetu.core.common.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhanghaonan
 * @date 2018/12/3
 */
@Service
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    private ConfigMapper configMapper;

    @Override
    public String queryValueByKey(String key){
        return configMapper.queryValueByKey(key);
    }

    @Override
    public void insertConfig(ConfigEntity config){
        int i = configMapper.updateConfig(config);
        if (i > 0){
            return;
        }
        i = configMapper.insertConfig(config);
        if (i < 1){
            throw new ServiceException("保存配置失败");
        }
    }
}
