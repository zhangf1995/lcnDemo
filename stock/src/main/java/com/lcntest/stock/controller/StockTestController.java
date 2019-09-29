package com.lcntest.stock.controller;

import com.lcntest.stock.entity.Stock;
import com.lcntest.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @BelongsProject: lcnDemo
 * @Author: zf
 * @CreateTime: 2019-09-27 16:24
 * @Description:
 */
@RestController
@RequestMapping("/stockTest")
public class StockTestController {

    @Autowired
    private StockService stockService;

    @RequestMapping("/stockSave")
    public void stockSave(){
        Stock stock = new Stock();
        stock.setId(1);
        stock.setStockNum(BigDecimal.ONE);
        stockService.save(stock);
    }
}