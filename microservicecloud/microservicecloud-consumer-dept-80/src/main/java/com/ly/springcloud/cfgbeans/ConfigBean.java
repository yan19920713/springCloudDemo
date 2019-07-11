package com.ly.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced//开启负载均衡  （Spring Cloud Ribbon是基于Netflix Ribbon实现的一套 客户端  负载均衡的工具。）
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
//        return new RoundRobinRule() // 轮询
//        return new RandomRule();// 随机：达到的目的，用我们重新选择的随机算法替代默认的轮询。（原来负载均衡是默认轮询）
        return new RetryRule();//重试
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
