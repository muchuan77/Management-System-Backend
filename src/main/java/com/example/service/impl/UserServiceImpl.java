package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.RestBean;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>implements UserService {
    @Autowired
    private UserMapper userMapper;

    // 添加身份验证的方法
    public RestBean<String> authenticateUser(String username, String password) {
        // 实现用户身份验证逻辑，可以在数据库中查询用户信息
        User user = userMapper.getUserByUsernameAndPassword(username,password);
        if (user != null && user.getPassword().equals(password)) {
            return RestBean.success("Login successful");
        }
        return RestBean.failure(401,"Authentication failed"); // 身份验证失败
    }
}
