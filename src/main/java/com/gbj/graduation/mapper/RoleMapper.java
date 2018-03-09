package com.gbj.graduation.mapper;

import com.gbj.graduation.model.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    public Map<String , Object> load(Integer role_id);
    public List<Role> roleList(Map<String, Object> map);
    public int count(Map<String, Object> map);
    public List<Role> roleEmpList(Map<String, Object> map);
}
