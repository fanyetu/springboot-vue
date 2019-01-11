package com.fanyetu.core.auth.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * @author zhanghaonan
 * @date 2018/11/30
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuVo {

    private Integer id;

    private Integer parentId;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    private Integer keepAlive;

    private Integer requireAuth;

    private Integer enable;

    private Integer createUser;

    private java.time.LocalDateTime createTime;

    private Integer updateUser;

    private java.time.LocalDateTime updateTime;

    private Integer delFlag;

    private List<MenuVo> children;
}
