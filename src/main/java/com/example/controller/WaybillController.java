package com.example.controller;

import com.example.entity.Waybill;
import com.example.mapper.WaybillMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/waybill")
public class WaybillController extends BaseController<Waybill, WaybillMapper>{
    @Resource
    private WaybillMapper waybillMapper;


    @Override
    protected WaybillMapper getMapper() {
        return waybillMapper;
    }
}
