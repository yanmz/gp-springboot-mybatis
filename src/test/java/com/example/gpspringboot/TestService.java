package com.example.gpspringboot;

import com.example.gpspringboot.service.OrdersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestService {
    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        OrdersService OrdersService = (OrdersService) context.getBean(com.example.gpspringboot.service.OrdersService.class);
        OrdersService.accountMoney();
    }
}
