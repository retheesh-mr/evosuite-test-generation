package poc.test.evosuite.repository;

import org.springframework.stereotype.Repository;
import poc.test.evosuite.model.Order;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private static List<Order> createdOrderList = new ArrayList<>();
    private static List<Order> submittedOrderList = new ArrayList<>();


    public void setCreatedOrderList(List<Order> createdOrderList) {
        OrderRepository.createdOrderList = createdOrderList;
    }


    public void setSubmittedOrderList(List<Order> submittedOrderList) {
        OrderRepository.submittedOrderList = submittedOrderList;
    }

    public Order getOrderFromCreatedOrderList(String orderId){
        for (Order order : createdOrderList) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    public void updateOrderInCreatedOrderList(Order order) {
        createdOrderList.removeIf(
                order1 -> order1.getOrderId().equals(order.getOrderId()));
        createdOrderList.add(order);
    }

    public boolean removeOrderFromCreatedOrderList(Order order){
        return createdOrderList.removeIf(
                order1 -> order1.getOrderId().equals(order.getOrderId()));
    }

    public void addOrderToCreatedOrderList(Order order){
        createdOrderList.add(order);
    }

    public void addOrderToSubmittedOrderList(Order order){
        submittedOrderList.add(order);
    }
}
