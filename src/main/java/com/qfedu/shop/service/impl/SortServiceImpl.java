package com.qfedu.shop.service.impl;

import com.qfedu.shop.dao.SortMapper;
import com.qfedu.shop.pojo.Sort;
import com.qfedu.shop.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SortServiceImpl implements SortService {
    @Autowired
    private SortMapper mapper;

    @Override
    public List<Sort> findAllSort() {
        return mapper.findAllSort();
    }
}
