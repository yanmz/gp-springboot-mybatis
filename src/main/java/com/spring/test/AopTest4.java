package com.spring.test;

import com.spring.service.OrderService;
import com.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 */
public class AopTest4 {
    public static void main(String[] args) {
        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_DefaultAdvisorAutoProxy.xml");

        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

        orderService.createOrder("Leo", "随便买点什么");
        orderService.queryOrder("Leo");
    }
}
