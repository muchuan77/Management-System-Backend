package com.example.controller;

import com.example.entity.Activity;
import com.example.mapper.ActivityMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class ActivityController extends BaseController<Activity, ActivityMapper>{
    @Resource
    private ActivityMapper activityMapper;

    @Override
    protected ActivityMapper getMapper() {
        return activityMapper;
    }
}
