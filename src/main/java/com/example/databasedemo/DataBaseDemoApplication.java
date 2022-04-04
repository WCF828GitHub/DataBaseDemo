package com.example.databasedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.databasedemo.mapper")
public class DataBaseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataBaseDemoApplication.class, args);
    }

}
