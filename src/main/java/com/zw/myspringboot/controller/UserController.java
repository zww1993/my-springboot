package com.zw.myspringboot.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zw.myspringboot.entity.User;
import com.zw.myspringboot.service.IUserService;
import com.zw.myspringboot.utils.redis.RedissonUtils;
import org.redisson.api.RBucket;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private RedissonUtils redissonUtils;
    @Resource
    private IUserService userService;

    @GetMapping("list")
    public IPage<User> list(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        IPage<User> page = userService.page(new Page<>(pageNo, pageSize), null);
        return page;
    }

    @GetMapping("exception")
    public String exception() {
        throw new RuntimeException("我是一个异常");
    }

    @GetMapping("redisGet")
    public Object redisGet(@RequestParam(value = "key") String key) {
        RBucket<Object> rBucket = redissonUtils.getRBucket(key);
        Object obj = rBucket.get();
        return obj;
    }

    @PostMapping("redisSet")
    public String redisSet(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value) {
        RBucket<Object> rBucket = redissonUtils.getRBucket(key);
        rBucket.set(value);
        return "success";
    }
}

