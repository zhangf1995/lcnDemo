package com.lcntest.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lcntest.stock.entity.Stock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockMapper extends BaseMapper<Stock> {
}
