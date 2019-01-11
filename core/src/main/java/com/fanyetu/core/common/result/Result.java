package com.fanyetu.core.common.result;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

/**
 * @author zhanghaonan
 * @date 2018/11/28
 */
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    /**
     * 返回状态码
     */
    private int code;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;
}
