package com.gbj.graduation.service;

import com.gbj.graduation.model.City;
import com.gbj.graduation.model.Country;
import com.gbj.graduation.model.Province;

import java.util.List;
import java.util.Map;

public interface AddressService {
    public List<Province> provinceList(Map<String, Object> map);
    public List<City> cityList(Map<String, Object> map);
    public List<Country> countryList(Map<String, Object> map);
}
