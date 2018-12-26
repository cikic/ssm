package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.domain.Order;
import com.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 查询所有订单
     */
    @RequestMapping("/findAll")
    public String findAll(@RequestParam(required = false,defaultValue = "1") int page,@RequestParam(required = false,defaultValue = "3") int size, Model model){

        List<Order> orders = orderService.findAll(page,size);
        System.out.println(size+"=================");
        System.out.println(page);
        PageInfo pageInfo = new PageInfo(orders);

        model.addAttribute("ordersList",orders);
        model.addAttribute("pageInfo",pageInfo);
        return "orders-list";
    }

}
