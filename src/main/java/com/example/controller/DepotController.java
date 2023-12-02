package com.example.controller;


import com.example.entity.Depot;
import com.example.mapper.DepotMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/depot")
public class DepotController extends BaseController<Depot, DepotMapper>{
    @Resource
    private DepotMapper depotMapper;

    @Override
    protected DepotMapper getMapper(){
        return depotMapper;
    }
}
