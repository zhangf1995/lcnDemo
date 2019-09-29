package com.lcntest.order.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.lcntest.order.entity.Order;
import com.lcntest.order.mapper.OrderMapper;
import com.lcntest.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * @BelongsProject: lcnDemo
 * @Author: zf
 * @CreateTime: 2019-09-27 11:34
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;

    @LcnTransaction
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void save(Order order, Integer i) {
        orderMapper.insert(order);
        restTemplate.getForEntity("http://192.168.0.104:8081/stockTest/stockSave",null);
        int a = 1/i;
    }
}