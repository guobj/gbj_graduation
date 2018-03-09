package com.gbj.graduation.mapper;

import com.gbj.graduation.model.ConsumerSource;

import java.util.List;
import java.util.Map;

public interface ConsumerSourceMapper {
    public Map<String , Object> load(Integer cs_id);
    public List<ConsumerSource> consumerSourceList();
}
