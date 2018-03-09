package com.gbj.graduation.service;

import com.gbj.graduation.model.Employee;

import java.util.Map;

public interface PersonalService {
    public Employee load(Map<String, Object> map);
    //提交保存修改的个人信息信息
    public int employeeUpdateAction(Map<String, Object> map);
    //修改密码
    public int passwordMdi(Map<String, Object> map);
}
