package poc.test.evosuite.service;

import poc.test.evosuite.model.Order;
import poc.test.evosuite.model.OrderItem;

import java.util.List;

public interface OrderManagerService {

    Order createOrder(List<OrderItem> orderItemList, String orderName);
    boolean deleteOrder(Order order);
    boolean addNewItemToExistingOrder(OrderItem orderItem, String orderId);
    boolean removeItemFromOrder(OrderItem orderItem, String orderId);
    boolean submitOrder(String orderId);

}
