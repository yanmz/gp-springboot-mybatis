package com.spring.service;


import com.spring.model.Order;

public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder(String username);
}
