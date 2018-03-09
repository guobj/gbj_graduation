package com.gbj.graduation.controller;

import com.gbj.graduation.model.Role;
import com.gbj.graduation.service.RoleService;
import com.gbj.graduation.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/roleList")
    public String roleList(Map<String , Object> map,Role role,@RequestParam(required=false,defaultValue="1")Integer pages,HttpServletRequest request){
        map = PageBean.serverMap(map , role , pages);
        map = roleService.roleList(map);
        map = PageBean.clientMap(map , pages , request);
        return "role/roleList";
    }
}
