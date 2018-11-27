package com.qfedu.shop.dao;

import com.qfedu.shop.pojo.Opinion;

public interface OpinionMapper {
    int deleteByPrimaryKey(Integer opinionId);

    int insert(Opinion record);

    int insertSelective(Opinion record);

    Opinion selectByPrimaryKey(Integer opinionId);

    int updateByPrimaryKeySelective(Opinion record);

    int updateByPrimaryKey(Opinion record);
}