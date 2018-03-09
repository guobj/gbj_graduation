package com.gbj.graduation.mapper;

import com.gbj.graduation.model.SaleModel;

import java.util.List;
import java.util.Map;

public interface SaleModelMapper {
    public Map<String , Object> load(Integer sm_id);
    public List<SaleModel> saleModelList();
}
