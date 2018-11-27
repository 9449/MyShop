package com.qfedu.shop.controller;

import com.qfedu.shop.service.GoodsService;
import com.qfedu.shop.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService service;

    /**
     * 查询8条最新的商品信息
     * @return
     */
    @RequestMapping("/findNewGoods")
    public ResponseVo findNewGoods() {
        return service.findNewGoods();
    }
}
