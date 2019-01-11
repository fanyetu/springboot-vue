package com.fanyetu.core.auth.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fanyetu.core.auth.entity.Menu;
/**
*  @author zhanghaonan
*/
public interface MenuBaseMapper {

    int insertMenu(Menu object);

    int updateMenu(Menu object);

    int update(Menu.UpdateBuilder object);

    List<Menu> queryMenu(Menu object);

    Menu queryMenuLimit1(Menu object);

}