package com.gbj.graduation.mapper;

import com.gbj.graduation.model.LicenseType;

import java.util.List;
import java.util.Map;

public interface LicenseTypeMapper {
    public Map<String , Object> load(Integer lt_id);
    public List<LicenseType> finAllLicense();
}
