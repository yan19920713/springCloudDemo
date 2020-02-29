package com.ly.springcloud;

import com.ly.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: microservicecloud
 * @description:
 * @author: Mr.Yan
 * @create: 2019-07-10
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效（MySelfRule类不能和com.ly.springcloud 当前包下及子包下）
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
