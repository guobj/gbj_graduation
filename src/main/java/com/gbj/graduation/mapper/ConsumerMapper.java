package com.gbj.graduation.mapper;

import com.gbj.graduation.model.Consumer;

import java.util.List;
import java.util.Map;

public interface ConsumerMapper {
    public List<Consumer> consumerList(Map<String, Object> map);
    public int count(Map<String, Object> map);
    public int consumerAddAction(Consumer consumer);
    public Consumer load(Integer con_id);
    public int consumerUpdateAction(Consumer consumer);
    public int consumerDel(Integer con_id);
    public int consumerMoreDel(Map<String, Object> map);
    //查询所有可用客户
    public List<Consumer> findAllList();
}
