package com.gbj.graduation.mapper;

import com.gbj.graduation.model.Industry;

import java.util.List;
import java.util.Map;

public interface IndustryMapper {
    public Map<String , Object> load(Integer in_id);
    public List<Industry> industryList();
}
