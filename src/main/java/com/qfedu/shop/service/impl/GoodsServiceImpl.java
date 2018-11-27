package com.qfedu.shop.service.impl;

import com.qfedu.shop.dao.GoodimgMapper;
import com.qfedu.shop.dao.GoodsMapper;
import com.qfedu.shop.pojo.Goodimg;
import com.qfedu.shop.pojo.Goods;
import com.qfedu.shop.service.GoodsService;
import com.qfedu.shop.utils.VoUtil;
import com.qfedu.shop.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper mapper;
    @Autowired
    private GoodimgMapper imgmapper;
    @Override
    public ResponseVo findNewGoods() {
        List<Goods> goods = mapper.findNewGoods();
        for(Goods good : goods) {
            List<Goodimg> imgs = imgmapper.findByGid(good.getGoodId());
            good.setImgs(imgs);
        }
        ResponseVo vo = VoUtil.setOK("已查询");
        vo.setData(goods);
        return vo;
    }
}
