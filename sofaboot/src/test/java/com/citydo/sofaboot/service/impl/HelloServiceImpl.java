package com.citydo.sofaboot.service.impl;

import com.citydo.sofaboot.service.HelloService;

/**
 * 服务端接口
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String string) {
        System.out.println("Server receive: " + string);
        return "hello " + string + " ！";
    }

}
