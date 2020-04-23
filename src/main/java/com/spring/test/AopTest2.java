package com.spring.test;

import com.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * API 方法级别拦截
 * Advisor 内部需要指定一个 Advice，Adisor决定该拦截哪些方法，拦截后需要完成的工作还是有内部的advice来做
 * @author admin
 */
public class AopTest2 {
    public static void main(String[] args) {
        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_advisor.xml");

        // 我们这里要取 AOP 代理：userServiceProxy，这非常重要
        UserService userService = (UserService) context.getBean("userServiceProxy");

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();
    }
}
