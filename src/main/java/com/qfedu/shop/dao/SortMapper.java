package com.qfedu.shop.dao;

import com.qfedu.shop.pojo.Sort;

import java.util.List;

public interface SortMapper {
    int deleteByPrimaryKey(Integer sortId);

    int insert(Sort record);

    int insertSelective(Sort record);

    Sort selectByPrimaryKey(Integer sortId);

    int updateByPrimaryKeySelective(Sort record);

    int updateByPrimaryKey(Sort record);

    List<Sort> findAllSort();
}