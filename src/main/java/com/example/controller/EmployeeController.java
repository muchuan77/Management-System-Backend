package com.example.controller;

import com.example.entity.Employee;
import com.example.mapper.EmployeeMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends BaseController<Employee, EmployeeMapper> {
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    protected EmployeeMapper getMapper() {
        return employeeMapper;
    }
}
