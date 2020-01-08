package com.gx.data.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.gx.data.server.mapper"})
public class XxlJobDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxlJobDataApplication.class, args);
    }

}
