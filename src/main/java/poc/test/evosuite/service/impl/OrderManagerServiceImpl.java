package poc.test.evosuite.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import poc.test.evosuite.model.Order;
import poc.test.evosuite.model.OrderItem;
import poc.test.evosuite.repository.OrderRepository;
import poc.test.evosuite.service.OrderManagerService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderManagerServiceImpl implements OrderManagerService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(List<OrderItem> orderItemList, String orderName) {

        List<Order> orderList = orderRepository.getCreatedOrderList();

        String orderId = UUID.randomUUID().toString();
        Date creationDate = new Date();

        Order order = new Order (orderId, orderName, creationDate);
        order.setOrderItemList(orderItemList);

        for (OrderItem orderItem:orderItemList) {
            order.setTotalPrice(order.getTotalPrice() + orderItem.getPrice());
        }

        orderList.add(order);

        return order;

    }

    @Override
    public boolean deleteOrder(Order order) {

        List<Order> submittedOrderList = orderRepository.getSubmittedOrderList();

        for (Order submittedOrder:submittedOrderList) {
            if (order ==submittedOrder){
                //todo return message can't delete submitted order
                return false;
            }
        }

        orderRepository.getCreatedOrderList().remove(order);
        return true;

    }

    @Override
    public boolean addNewItemToExistingOrder(OrderItem orderItem, String orderId) {

        List<Order> orderList = orderRepository.getCreatedOrderList();
        Order currentOrder;

        for (Order order:orderList) {
            if (order.getOrderId() == orderId){

                currentOrder = order;
                orderRepository.getCreatedOrderList().remove(currentOrder);

                currentOrder.getOrderItemList().add(orderItem);
                orderRepository.getCreatedOrderList().add(currentOrder);

                return true;
            }
        }

        return false;
    }

    @Override
    public boolean removeItemFromOrder(OrderItem orderItem, String orderId) {

        List<Order> orderList = orderRepository.getCreatedOrderList();
        Order currentOrder;

        for (Order order:orderList) {
            if (order.getOrderId() == orderId){

                currentOrder = order;
                orderRepository.getCreatedOrderList().remove(currentOrder);

                currentOrder.getOrderItemList().remove(orderItem);
                orderRepository.getCreatedOrderList().add(currentOrder);

                return true;
            }
        }

        return false;
    }

    @Override
    public boolean submitOrder(String orderId) {

        List<Order> orderList = orderRepository.getCreatedOrderList();
        Order currentOrder = null;

        for (Order order:orderList) {
            if (order.getOrderId() == orderId){

            }
        }

        if (currentOrder != null) {

            orderRepository.getCreatedOrderList().remove(currentOrder);
            orderRepository.getSubmittedOrderList().add(currentOrder);

            return true;

        } else{

            return false;

        }

    }

}
