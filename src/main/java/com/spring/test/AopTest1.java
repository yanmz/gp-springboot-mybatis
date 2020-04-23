package com.spring.test;

import com.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 实现API 实现aop代理 类级别的拦截
 * 缺点：如果想要拦截OrderService ，那么还需要生成一个OrderService 的代理，只能做到类级别的代理 ，无法做到方法级别
 */
public class AopTest1 {
    public static void main(String[] args) {
        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_advice.xml");

        // 我们这里要取 AOP 代理：userServiceProxy，这非常重要
        UserService userService = (UserService) context.getBean("userServiceProxy");

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();
    }

}
