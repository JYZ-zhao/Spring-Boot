package com.zjy.springboot01helloworld.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这个注解表示这个类所有方法返回的数据直接写给浏览器(如果是对象转成json)
/*@Controller
@ResponseBody*/
@RestController
public class HelloController {

    //@ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "helloWorld";
    }

}
