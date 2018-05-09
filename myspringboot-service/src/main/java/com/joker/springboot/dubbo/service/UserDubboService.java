package com.joker.springboot.dubbo.service;

import java.util.List;

import com.joker.springboot.base.entity.UpmsUser;

public interface UserDubboService
{
    List<UpmsUser> queryUserList();
}
