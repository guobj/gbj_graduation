package com.gbj.graduation.mapper;

import com.gbj.graduation.model.GoodsType;

import java.util.List;
import java.util.Map;

public interface GoodsTypeMapper {
    public List<GoodsType> typeList();
    public List<GoodsType> typeLikeList(Map<String, Object> map);
    public int count(Map<String, Object> map);
    public int goodsTypeAddAction(GoodsType goodsType);
    public int goodsTypeDelAction(Integer gt_id);
}
