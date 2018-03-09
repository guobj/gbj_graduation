package com.gbj.graduation.mapper;

import com.gbj.graduation.model.EconomicType;

import java.util.List;
import java.util.Map;

public interface EconomicTypeMapper {
    public Map<String , Object> load(Integer et_id);
    public List<EconomicType> economicTypeList();
}
