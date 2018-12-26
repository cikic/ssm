package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.ssm.domain.Order;
import com.ssm.mapper.OrderMapper;
import com.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAll(int page, int size) {
        //参数pageNum是当前页，pagesize是每页显示的条目数
        PageHelper.startPage(page,size);
        return orderMapper.findAll();
    }
}
