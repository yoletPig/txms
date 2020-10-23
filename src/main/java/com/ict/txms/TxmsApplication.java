package com.ict.txms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ict.txms.mapper")
public class TxmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TxmsApplication.class, args);
    }

}
