package com.fanyetu.core.common.mapper;

import com.fanyetu.core.common.entity.ConfigEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhanghaonan
 * @date 2018/12/3
 */
public interface ConfigMapper {

    int insertConfig(ConfigEntity config);

    String queryValueByKey(@Param("key") String key);

    int updateConfig(ConfigEntity config);

}
