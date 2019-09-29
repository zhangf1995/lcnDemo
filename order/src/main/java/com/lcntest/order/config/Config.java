package com.lcntest.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: lcnDemo
 * @Author: zf
 * @CreateTime: 2019-09-27 17:10
 * @Description:
 */
@Component
public class Config {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}