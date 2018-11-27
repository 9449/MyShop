package com.qfedu.shop.dao;

import com.qfedu.shop.pojo.OrderLine;

public interface OrderLineMapper {
    int deleteByPrimaryKey(Integer olId);

    int insert(OrderLine record);

    int insertSelective(OrderLine record);

    OrderLine selectByPrimaryKey(Integer olId);

    int updateByPrimaryKeySelective(OrderLine record);

    int updateByPrimaryKey(OrderLine record);
}