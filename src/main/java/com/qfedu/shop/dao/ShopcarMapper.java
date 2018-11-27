package com.qfedu.shop.dao;

import com.qfedu.shop.pojo.Shopcar;

public interface ShopcarMapper {
    int deleteByPrimaryKey(Integer carId);

    int insert(Shopcar record);

    int insertSelective(Shopcar record);

    Shopcar selectByPrimaryKey(Integer carId);

    int updateByPrimaryKeySelective(Shopcar record);

    int updateByPrimaryKey(Shopcar record);
}