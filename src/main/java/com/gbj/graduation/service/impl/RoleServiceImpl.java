package com.gbj.graduation.service.impl;

import com.gbj.graduation.mapper.RoleMapper;
import com.gbj.graduation.model.Role;
import com.gbj.graduation.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public Map<String , Object> roleList(Map<String , Object> map ) {
        // TODO Auto-generated method stub
        List<Role> roleList = roleMapper.roleList(map);
        int count = roleMapper.count(map);
        if(roleList!=null&&roleList.size()>0){
            map.put("roleList" , roleList);
            map.put("count" , count);
            return map;
        }else{
            throw new RuntimeException("没有数据");
        }
    }

}
