package com.example.controller;


import com.example.entity.User;
import com.example.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User, UserMapper> {
    @Resource
    private UserMapper userMapper;

    @Override
    protected UserMapper getMapper() {
        return userMapper;
    }
}
