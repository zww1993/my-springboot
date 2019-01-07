package com.zw.myspringboot.service.impl;

import com.zw.myspringboot.entity.User;
import com.zw.myspringboot.dao.UserMapper;
import com.zw.myspringboot.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
