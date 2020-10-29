package com.telenet.evosuite.service;

import com.telenet.evosuite.model.Order;
import com.telenet.evosuite.model.OrderItem;

import java.util.List;

public interface OrderManagerService {

    Order createOrder(List<OrderItem> orderItemList);
    boolean deleteOrder(Order order);
    boolean addNewItemToExistingOrder(OrderItem orderItem);
    boolean removeItemFromOrder(OrderItem orderItem);
}
