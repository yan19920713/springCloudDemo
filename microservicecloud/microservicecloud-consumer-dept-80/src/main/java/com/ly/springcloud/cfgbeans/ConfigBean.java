package com.ly.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: microservicecloud
 * @description:
 * @author: Mr.Yan
 * @create: 2019-07-09
 **/
@Configuration
public class ConfigBean {
    //boot 优化了spring框架 --> spring applicationContext.xml --- @Configuration注解版配置  只要类上面加上@Configuration就相当于 ConfigBean = applicationContext.xml
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(上面加@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">
// <bean> == @Bean  id="userServcie"  ==  UserServcie  new UserServcieImpl() == class="com.atguigu.tmall.UserServiceImpl"
