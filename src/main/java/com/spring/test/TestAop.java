package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.IUserManagerService;
public class TestAop {

    public static void main(String[] args) throws Exception{

        ApplicationContext act =  new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserManagerService userManager = (IUserManagerService)act.getBean("userManager");
        userManager.findUser();
        System.out.println("\n");
        userManager.addUser();
    }
}