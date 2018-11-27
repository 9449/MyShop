package com.qfedu.shop.service.impl;

import com.qfedu.shop.dao.UserMapper;
import com.qfedu.shop.pojo.User;
import com.qfedu.shop.service.UserService;
import com.qfedu.shop.utils.VoUtil;
import com.qfedu.shop.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
    @Override
    public int register(User user) {
        return mapper.insertSelective(user);
    }

    @Override
    public ResponseVo verifyUser(User user) {
        User userL = mapper.selectByUsername(user);
        if(userL == null) {
            return VoUtil.setOK("用户名可用");
        } else {
            return VoUtil.setERROR("用户名已存在");
        }

    }
}
