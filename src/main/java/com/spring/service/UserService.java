package com.spring.service;


import com.spring.model.User;

public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
