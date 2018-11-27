package com.qfedu.shop.dao;

import com.qfedu.shop.pojo.ShopGood;

public interface ShopGoodMapper {
    int deleteByPrimaryKey(Integer sgId);

    int insert(ShopGood record);

    int insertSelective(ShopGood record);

    ShopGood selectByPrimaryKey(Integer sgId);

    int updateByPrimaryKeySelective(ShopGood record);

    int updateByPrimaryKey(ShopGood record);
}