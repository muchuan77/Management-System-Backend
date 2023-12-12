package com.example.controller;


import com.example.entity.LoginRequest;
import com.example.entity.RestBean;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class UserController extends BaseController<User, UserMapper> {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserServiceImpl userService;

    @PostMapping("/login")
    public RestBean<String> login(@RequestBody LoginRequest loginRequest) {
        // Assuming you have a method in UserService to authenticate user
        RestBean<String> user = userService.authenticateUser(loginRequest.getUsername(),loginRequest.getPassword());

        if (user != null) {
            // 登录成功
            return RestBean.success("Login successful");
        } else {
            // 认证失败
            return RestBean.failure(401, "Authentication failed");
        }
    }


    @Override
    protected UserMapper getMapper() {
        return userMapper;
    }
}
