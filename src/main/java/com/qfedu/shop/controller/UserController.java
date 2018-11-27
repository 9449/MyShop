package com.qfedu.shop.controller;

import com.qfedu.shop.pojo.User;
import com.qfedu.shop.service.UserService;
import com.qfedu.shop.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    /**
     *客户注册功能
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public int register(User user) {
        return service.register(user);
    }

    /**
     * 根据传递过来的用户名查询是否存在
     * @param user
     * @return
     */
    @RequestMapping("/verify")
    public ResponseVo verifyUser(User user) {
        return service.verifyUser(user);
    }


}
