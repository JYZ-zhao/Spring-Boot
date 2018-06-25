package com.zjy.springboot01helloworld;

import com.zjy.springboot01helloworld.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * springBoot的单元测试
 *
 * 可以在测试期间很方便的,类似编码一样进行自动注入容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HelloworldApplicationTests {

    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
