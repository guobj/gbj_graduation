package com.gbj.graduation.mapper;

import com.gbj.graduation.model.Menu;

import java.util.List;
import java.util.Map;

public interface MenuMapper {
    List<Menu> queryHaveMenu(Integer role_id);
    List<Menu> queryNotHaveMenu(Integer role_id);
    int delMenu(Map<String, Object> map);
    int mdiMenu(Map<String, Object> map);
}
