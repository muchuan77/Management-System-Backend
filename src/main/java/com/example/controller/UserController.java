package com.example.controller;


import com.example.entity.User;
import com.example.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173",allowCredentials = "true")
public class UserController extends BaseController<User, UserMapper> {
    @Resource
    private UserMapper userMapper;
    @Override
    protected UserMapper getMapper() {
        return userMapper;
    }
}
