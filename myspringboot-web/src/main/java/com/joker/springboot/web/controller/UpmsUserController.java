package com.joker.springboot.web.controller;


import com.joker.springboot.base.entity.UpmsUser;
import com.joker.springboot.service.UpmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户
 */
@RestController
public class UpmsUserController {
    @Autowired
    private UpmsUserService upmsUserService;

    @RequestMapping("/userList")
    public List<UpmsUser> queryUserList() {
        return upmsUserService.queryUserList();
    }
}
