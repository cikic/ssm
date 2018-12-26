package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    /**
     * 查询所有订单
     */
    @RequestMapping("findAll")
    public String findAll(){

        return "orders-list";
    }

}
