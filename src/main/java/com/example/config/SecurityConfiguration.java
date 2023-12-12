package com.example.config;

import com.example.entity.RestBean;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import org.springframework.security.web.SecurityFilterChain;

import java.io.IOException;
import java.io.PrintWriter;

@Configuration
public class SecurityConfiguration {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeHttpRequests(conf -> {
//                    conf.anyRequest().authenticated();
//                })
//                .formLogin(conf -> {
//                    conf.loginProcessingUrl("api/user/login");
//                    // 使用自定义的成功和失败处理器
//                    conf.successHandler(this::onAuthenticationSuccess);
//                    conf.failureHandler(this::onAuthenticationFailure);
//                    conf.permitAll();
//                })
//                .csrf(AbstractHttpConfigurer::disable)
//                .build();
//    }
//
//    private void onAuthenticationSuccess(HttpServletRequest request,
//                                         HttpServletResponse response,
//                                         Authentication authentication) throws IOException {
//        System.out.println("Authentication succeeded: " + authentication.getName());
//        response.setContentType("application/json;charset=utf-8");
//        PrintWriter writer = response.getWriter();
//        writer.write(RestBean.success(authentication.getName()).asJsonString());
//    }
//
//    private void onAuthenticationFailure(HttpServletRequest request,
//                                         HttpServletResponse response,
//                                         AuthenticationException exception) throws IOException {
//        System.out.println("Authentication failed: " + exception.getMessage());
//        response.setContentType("application/json;charset=utf-8");
//        PrintWriter writer = response.getWriter();
//        writer.write(RestBean.failure(401, exception.getMessage()).asJsonString());
//    }
}


