package com.joker.springboot.web.controller;


import com.alibaba.fastjson.JSON;
import com.joker.springboot.base.entity.UpmsUser;
import com.joker.springboot.service.UpmsPermissionService;
import com.joker.springboot.service.UpmsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户
 */
@RestController
public class UpmsUserController {
    private final Logger log = LoggerFactory.getLogger(UpmsUserController.class);
    @Autowired
    private UpmsUserService upmsUserService;
    @Autowired
    private UpmsPermissionService upmsPermissionService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/userList")
    public List<UpmsUser> queryUserList() {
        return upmsUserService.queryUserList();
    }

    @RequestMapping("/viewPermissions")
    public List queryUserPermissions(){
        Object permissions = redisTemplate.opsForValue().get("permissions");
        log.debug("redis 取值 key:[{}],value:[{}]","permissions",permissions);
        List<String> list  = null;
        if(permissions == null){
            log.info("==================redis============================");
            list = upmsPermissionService.queryPermissionsByLoginId("admin");
            redisTemplate.opsForList().leftPushAll("permissions",list);
        }else{
            list = JSON.parseArray(permissions.toString(),java.lang.String.class);
        }
       return list;
    }
}
