package com.spring.test;

import com.spring.service.OrderService;
import com.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *实现自动代理
 * @author admin
 */
public class AopTest3 {
    public static void main(String[] args) {
        // 启动 Spring 的 IOC 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_BeanNameAutoProxy.xml");

        // 注意这里，不再需要根据代理找 bean
        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

        orderService.createOrder("Leo", "随便买点什么");
        orderService.queryOrder("Leo");
    }
}
