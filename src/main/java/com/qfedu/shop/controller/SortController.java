package com.qfedu.shop.controller;

import com.qfedu.shop.pojo.Sort;
import com.qfedu.shop.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SortController {
    @Autowired
    private SortService service;

    /**
     * 查询所有的商品种类
     * @return
     */
    @RequestMapping("/findAllSort")
    public List<Sort> findAllSort() {
        return service.findAllSort();
    }
}
