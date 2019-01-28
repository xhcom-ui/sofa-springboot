package com.citydo.sofaboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SofabootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofabootApplication.class, args);
        System.out.print("---------"+System.currentTimeMillis());
    }

}

