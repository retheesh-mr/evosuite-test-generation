package com.telenet.evosuite.service.impl;

import com.telenet.evosuite.model.Order;
import com.telenet.evosuite.model.OrderItem;
import com.telenet.evosuite.service.OrderManagerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderManagerServiceImpl implements OrderManagerService {

    @Override
    public Order createOrder(List<OrderItem> orderItemList) {
        return null;
    }

    @Override
    public boolean deleteOrder(Order order) {
        return false;
    }

    @Override
    public boolean addNewItemToExistingOrder(OrderItem orderItem) {
        return false;
    }

    @Override
    public boolean removeItemFromOrder(OrderItem orderItem) {
        return false;
    }
}
