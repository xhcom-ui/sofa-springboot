package com.citydo.sofaboot_client;

import com.citydo.sofaboot_client.service.HelloCallbackService;
import com.citydo.sofaboot_client.service.HelloFutureService;
import com.citydo.sofaboot_client.service.HelloSyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @author nick
 */
@ImportResource({"classpath:spring/rpc-sofa.xml"})
@SpringBootApplication
public class SofabootClientApplication {

    public static void main(String[] args) {
        System.setProperty("server.port", "8081");
        SpringApplication springApplication = new SpringApplication(SofabootClientApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
        HelloSyncService boltHelloSyncService = (HelloSyncService) applicationContext.getBean("boltHelloSyncServiceReference");
        HelloSyncService restHelloSyncService = (HelloSyncService) applicationContext.getBean("restHelloSyncServiceReference");
        HelloSyncService dubboHelloSyncService = (HelloSyncService) applicationContext.getBean("dubboHelloSyncServiceReference");
        System.out.println("Bolt result:" + boltHelloSyncService.saySync("bolt"));
        System.out.println("Rest result:" + restHelloSyncService.saySync("rest"));
        System.out.println("Dubbo result:" + dubboHelloSyncService.saySync("dubbo"));

//        HelloFutureService helloFutureServiceReference = (HelloFutureService) applicationContext
////                .getBean("helloFutureServiceReference");
////        helloFutureServiceReference.sayFuture("future");
////        try {
////            String result = (String)SofaResponseFuture.getResponse(1000, true);
////            System.out.println("Future result: " + result);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }


        HelloCallbackService helloCallbackServiceReference = (HelloCallbackService) applicationContext
                .getBean("helloCallbackServiceReference");
        helloCallbackServiceReference.sayCallback("callback");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

