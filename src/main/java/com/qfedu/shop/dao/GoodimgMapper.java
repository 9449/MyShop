package com.qfedu.shop.dao;

import com.qfedu.shop.pojo.Goodimg;

import java.util.List;

public interface GoodimgMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(Goodimg record);

    int insertSelective(Goodimg record);

    Goodimg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(Goodimg record);

    int updateByPrimaryKey(Goodimg record);

    List<Goodimg> findByGid(int gid);
}