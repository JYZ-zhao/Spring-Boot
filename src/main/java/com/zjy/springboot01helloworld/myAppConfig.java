package com.zjy.springboot01helloworld;


import com.zjy.springboot01helloworld.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:指明当前类是一个配置类，就是来替代之前的spring配置文件*.xml
 *
 * 在配置文件中使用<bean></bean>标签添加组件
 */
@Configuration
public class myAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类给容器中添加组件了");
        return new HelloService();
    }
}
