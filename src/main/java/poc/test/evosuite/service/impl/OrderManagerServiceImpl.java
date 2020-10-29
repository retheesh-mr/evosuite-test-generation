package poc.test.evosuite.service.impl;

import poc.test.evosuite.model.Order;
import poc.test.evosuite.model.OrderItem;
import poc.test.evosuite.service.OrderManagerService;
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
