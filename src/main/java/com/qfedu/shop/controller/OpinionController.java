package com.qfedu.shop.controller;

import com.qfedu.shop.pojo.Opinion;
import com.qfedu.shop.service.OpinionService;
import com.qfedu.shop.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpinionController {
    @Autowired
    private OpinionService service;

    /**
     * 添加客户的建议
     * @param opinion
     * @return
     */
    @RequestMapping("/addOpinion")
    public ResponseVo addOpinion(Opinion opinion) {
        return service.addOpinion(opinion);
    }
}
