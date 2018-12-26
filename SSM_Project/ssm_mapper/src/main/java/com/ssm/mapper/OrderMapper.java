package com.ssm.mapper;

import com.ssm.domain.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> findAll();
}
