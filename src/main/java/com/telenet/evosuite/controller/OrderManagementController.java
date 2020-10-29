package com.telenet.evosuite.controller;

import com.telenet.evosuite.model.Order;
import com.telenet.evosuite.model.OrderItem;
import com.telenet.evosuite.service.OrderManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderManagementController {

    @Autowired
    private OrderManagerService orderManagerService;

    public Order createOrder(List<OrderItem> orderItemList){
        return null;
    }

    public boolean deleteOrder(Order order){
        return false;
    }

    public Order addNewItems(List<OrderItem> orderItemList){
        return null;
    }

    public Order deleteItem(OrderItem orderItem){
        return null;
    }
}
