package com.qfedu.shop.service;

import com.qfedu.shop.pojo.User;
import com.qfedu.shop.vo.ResponseVo;

public interface UserService {
    int register(User user);

    ResponseVo verifyUser(User user);
}
