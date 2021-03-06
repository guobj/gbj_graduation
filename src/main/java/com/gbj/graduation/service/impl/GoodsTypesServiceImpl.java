package com.gbj.graduation.service.impl;

import com.gbj.graduation.mapper.GoodsTypeMapper;
import com.gbj.graduation.model.GoodsType;
import com.gbj.graduation.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsTypesServiceImpl implements GoodsTypeService {
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Override
    public Map<String , Object> typeList(Map<String , Object> map){
        List<GoodsType> typeList = goodsTypeMapper.typeList();
        map.put("typeList" , typeList);
        return map;
    }
    @Override
    public Map<String , Object> typeLikeList(Map<String , Object> map ) {
        // TODO Auto-generated method stub
        List<GoodsType> typeLikeList = goodsTypeMapper.typeLikeList(map);
        int count = goodsTypeMapper.count(map);
        if(typeLikeList!=null&&typeLikeList.size()>0){
            map.put("typeLikeList" , typeLikeList);
            map.put("count" , count);
            return map;
        }else{
            throw new RuntimeException("没有数据");
        }
    }
    @Override
    public int goodsTypeAdd(Map<String , Object> map ) {
        // TODO Auto-generated method stub
        int result = goodsTypeMapper.goodsTypeAddAction((GoodsType)map.get("goodsType"));
        if(result>0){
            map.put("message" , "添加成功");
            return result;
        }else{
            throw new RuntimeException("添加失败");
        }

    }
    @Override
    public int goodsTypeDelAction(Map<String , Object> map, Integer gt_id ) {
        // TODO Auto-generated method stub
        int result = goodsTypeMapper.goodsTypeDelAction(gt_id);
        if(result>0){
            map.put("message" , "删除成功");
            return result;
        }else{
            throw new RuntimeException("删除失败");
        }
    }
}
