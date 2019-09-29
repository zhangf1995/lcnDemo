package com.lcntest.order.controller;

import com.lcntest.order.entity.Order;
import com.lcntest.order.mapper.OrderMapper;
import com.lcntest.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @BelongsProject: lcnDemo
 * @Author: zf
 * @CreateTime: 2019-09-27 11:19
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class LcnTestController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/lcnTest/{i}")
    public void lcnTest(@PathVariable("i") Integer i){
        Order order = new Order();
        order.setId(1);
        order.setOrderName("zhangsan");
        orderService.save(order,i);
    }
}