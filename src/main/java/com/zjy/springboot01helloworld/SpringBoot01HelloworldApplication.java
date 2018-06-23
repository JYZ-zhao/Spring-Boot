package com.zjy.springboot01helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个 Spring Boot应用
 */
@SpringBootApplication
public class SpringBoot01HelloworldApplication {

    public static void main(String[] args) {

        // spring 应用启动起来
        SpringApplication.run(SpringBoot01HelloworldApplication.class, args);

    }
}
