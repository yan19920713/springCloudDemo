package com.ly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: microservicecloud
 * @description:
 * @author: Mr.Yan
 * @create: 2019-07-10
 **/
@SpringBootApplication//
@EnableEurekaServer//在主启动类上面，标注的启动该新组件技术的相关注解标签@EnableEurekaServer,EurekaServer服务器端的启动类,接受其它微服务注册进来
public class EurekaServer7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
