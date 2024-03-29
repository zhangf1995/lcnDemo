package com.lcntest.lcnmanager;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class LcnmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcnmanagerApplication.class, args);
    }

}
