package com.zjy.springboot01helloworld.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 组件
 *
 * @Component:将普通pojo注入到spring容器中，相当于配置文件中的<bean id="" class="" />
 * <p>
 * 将配置文件中配置的每一个属性的值映射到组件中
 * <p>
 * 使用注解
 * @ConfigurationProperties:告诉SpringBoot将本类中所有属性和配置文件中相关的配置进行绑定；
 * prefix = "person":配置文件中哪个下面的所有属性进行一一对应
 * <p>
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 * 动态绑定参数
 *
 * @Validated：校验数据
 *
 * @ConfigurationProperties(prefix = "person")默认从全局配置文件中获取
 *@PropertySource(value = {"classpath:person.properties"})加载指定配置文件列表
 *
 *
 *
 */


@Component
//方式一，注入配置文件中的值  此方法支持JSR303数据校验 方式二@Value("false")
@ConfigurationProperties(prefix = "person")
//导入自定义配置文件
//@PropertySource("classpath:person.properties")
//@PropertySource(value = {"classpath:person.properties"})
//数据校验
//@Validated
public class Person {
    /**
     * <bean class="person">
     *      <property name = "name" value = "可以写字面量  / ${key}:从环境和变量或者配置文件中获取值" /#{SpEL}>
     *      </property>
     * </bean>
     */
    // @Value("${person.name}
    //name必须填写成邮箱格式
    //@Email
    private String name;
    //使用spring表达式
    // @Value("#{11*3}")
    private Integer age;
    // @Value("false")
    private Boolean boss;
    private Date birth;

    private Map<String, Object> map;
    private List<Object> list;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
