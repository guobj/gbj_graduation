package com.gbj.graduation.controller;

import com.gbj.graduation.model.City;
import com.gbj.graduation.model.Country;
import com.gbj.graduation.model.Province;
import com.gbj.graduation.service.AddressService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Controller
public class AddressController {
    @Autowired
    private AddressService addressService;
    @RequestMapping("/province")
    public void provinceList(Map<String , Object> map,HttpServletResponse response){
        try{
            List<Province> provinceList = addressService.provinceList(map);
            Gson gson = new Gson();
            String data = gson.toJson(provinceList);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print(data);
            out.flush();
            out.close();
        }catch(Exception e){
            // TODO: handle exception
            map.put("message" , e.getMessage());
        }
    }
    @RequestMapping("/city")
    public void cityList(Map<String , Object> map,HttpServletResponse response,String provinceID){
        try{
            map.put("provinceID" , provinceID);
            List<City> cityList = addressService.cityList(map);
            Gson gson = new Gson();
            String data = gson.toJson(cityList);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print(data);
            out.flush();
            out.close();
        }catch(Exception e){
            // TODO: handle exception
            map.put("message" , e.getMessage());
        }
    }
    @RequestMapping("/country")
    public void countryList(Map<String , Object> map,HttpServletResponse response,String cityID){
        try{
            map.put("cityID" , cityID);
            List<Country> countryList = addressService.countryList(map);
            Gson gson = new Gson();
            String data = gson.toJson(countryList);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print(data);
            out.flush();
            out.close();
        }catch(Exception e){
            // TODO: handle exception
            map.put("message" , e.getMessage());
        }
    }
}
