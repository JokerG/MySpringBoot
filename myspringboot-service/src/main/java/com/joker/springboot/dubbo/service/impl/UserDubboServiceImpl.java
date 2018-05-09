package com.joker.springboot.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.joker.springboot.base.dao.UpmsUserMapper;
import com.joker.springboot.base.entity.UpmsUser;
import com.joker.springboot.base.entity.UpmsUserExample;
import com.joker.springboot.dubbo.service.UserDubboService;

/**
 * com.alibaba.dubbo.config.annotation.Service 注解 标记为dubbo服务
 */
@Service(version = "1.0.0")
public class UserDubboServiceImpl implements UserDubboService
{
    @Autowired
    private UpmsUserMapper upmsUserMapper;

    @Override
    public List<UpmsUser> queryUserList()
    {
        return upmsUserMapper.selectByExample(new UpmsUserExample());
    }
}
