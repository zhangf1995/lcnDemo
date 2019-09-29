package com.lcntest.stock.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.lcntest.stock.entity.Stock;
import com.lcntest.stock.mapper.StockMapper;
import com.lcntest.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @BelongsProject: lcnDemo
 * @Author: zf
 * @CreateTime: 2019-09-27 11:37
 * @Description:
 */
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;

    @LcnTransaction
    @Transactional
    @Override
    public void save(Stock stock){
        stockMapper.insert(stock);
    }
}