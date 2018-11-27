package com.qfedu.shop.service.impl;

import com.qfedu.shop.dao.OpinionMapper;
import com.qfedu.shop.pojo.Opinion;
import com.qfedu.shop.service.OpinionService;
import com.qfedu.shop.utils.VoUtil;
import com.qfedu.shop.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OpinionServiceImpl implements OpinionService {
    @Autowired
    private OpinionMapper mapper;

    @Override
    public ResponseVo addOpinion(Opinion opinion) {
        int i = mapper.insertSelective(opinion);
        if (i > 0) {
            return VoUtil.setOK("问题已提交");
        } else {
            return VoUtil.setERROR("问题提交失败");
        }

    }
}
