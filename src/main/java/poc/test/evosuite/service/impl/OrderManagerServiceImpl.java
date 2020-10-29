package poc.test.evosuite.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import poc.test.evosuite.model.Order;
import poc.test.evosuite.model.OrderItem;
import poc.test.evosuite.repository.OrderRepository;
import poc.test.evosuite.service.OrderManagerService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderManagerServiceImpl implements OrderManagerService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(List<OrderItem> orderItemList, String orderName) {

        String orderId = UUID.randomUUID().toString();
        Date creationDate = new Date();

        Order order = new Order (orderId, orderName, creationDate);
        order.setOrderItemList(orderItemList);

        for (OrderItem orderItem:orderItemList) {
            order.setTotalPrice(order.getTotalPrice() + orderItem.getPrice());
        }

        orderRepository.addOrderToCreatedOrderList(order);
        return order;

    }

    @Override
    public boolean deleteOrder(Order order) {

        orderRepository.removeOrderFromCreatedOrderList(order);
        return true;

    }

    @Override
    public boolean addNewItemToExistingOrder(OrderItem orderItem, String orderId) {

        Order currentOrder = orderRepository.getOrderFromCreatedOrderList(orderId);
        currentOrder.getOrderItemList().add(orderItem);
        orderRepository.updateOrderInCreatedOrderList(currentOrder);
        return true;
    }

    @Override
    public boolean removeItemFromOrder(OrderItem orderItem, String orderId) {

        Order currentOrder = orderRepository.getOrderFromCreatedOrderList(orderId);
        currentOrder.getOrderItemList().remove(orderItem);
        orderRepository.updateOrderInCreatedOrderList(currentOrder);

        return false;
    }

    @Override
    public boolean submitOrder(String orderId) {

        Order currentOrder = orderRepository.getOrderFromCreatedOrderList(orderId);

        if (currentOrder != null) {

            orderRepository.removeOrderFromCreatedOrderList(currentOrder);
            orderRepository.getSubmittedOrderList().add(currentOrder);

            return true;

        } else{

            return false;

        }

    }

}
