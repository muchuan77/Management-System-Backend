package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Waybill;
import com.example.mapper.WaybillMapper;
import com.example.service.WaybillService;
import org.springframework.stereotype.Service;

@Service
public class WaybillServiceImpl extends ServiceImpl<WaybillMapper, Waybill>implements WaybillService {
}
