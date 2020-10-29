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

        UUID orderId = UUID.randomUUID();
        Date creationDate = new Date("dd/MM/yyyy HH:mm:ss");

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
