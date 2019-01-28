package com.citydo.sofaboot_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


/**
 * 单向调用、同步调用、异步调用和回调
 */
@ImportResource({"classpath:spring/rpc-sofa.xml"})
@SpringBootApplication
public class SofabootServerApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SofabootServerApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
    }

}

