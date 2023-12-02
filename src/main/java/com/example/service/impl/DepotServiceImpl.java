package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Depot;
import com.example.mapper.DepotMapper;
import com.example.service.DepotService;
import org.springframework.stereotype.Service;

@Service
public class DepotServiceImpl extends ServiceImpl<DepotMapper, Depot>implements DepotService {
}
