package com.gbj.graduation.mapper;

import com.gbj.graduation.model.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentMapper {
    //查询部门ByID
    public Map<String , Object> load(Integer dep_id);
    //查询全部部门
    public List<Department> depList();
}
