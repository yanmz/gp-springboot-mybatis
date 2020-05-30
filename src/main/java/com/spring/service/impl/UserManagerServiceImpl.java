package com.spring.service.impl;

import com.spring.service.IUserManagerService;

/**
 * 业务实现类
 */
public class UserManagerServiceImpl implements IUserManagerService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String findUser() {
        System.out.println("============执行业务方法findUser,查找的用户是："+name+"=============");
        return name;
    }

    @Override
    public void addUser() {
        System.out.println("============执行业务方法addUser=============");

    }
}
