package poc.test.evosuite.repository;

import org.springframework.stereotype.Repository;
import poc.test.evosuite.model.Order;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private static List<Order> createdOrderList = new ArrayList();
    private static List<Order> submittedOrderList = new ArrayList();

    public List<Order> getCreatedOrderList() {
        return createdOrderList;
    }

    public void setCreatedOrderList(List<Order> createdOrderList) {
        this.createdOrderList = createdOrderList;
    }

    public List<Order> getSubmittedOrderList() {
        return submittedOrderList;
    }

    public void setSubmittedOrderList(List<Order> submittedOrderList) {
        this.submittedOrderList = submittedOrderList;
    }

    public Order getOrderFromCreatedOrderList(String orderId){

        for (Order order:createdOrderList) {
            if (order.getOrderId() == orderId){
                return order;
            }
        }

        return null;

    }

    public void updateOrderInCreatedOrderList(Order order){




    }

    public void removeOrderFromCreatedOrderList(Order order){

        createdOrderList.remove(order);

    }

    public void addOrderToCreatedOrderList(Order order){

        createdOrderList.add(order);

    }

    public void removeOrderFromSubmittedOrderList(Order order){

        submittedOrderList.remove(order);

    }

    public void addOrderToSubmittedOrderList(Order order){

        submittedOrderList.add(order);

    }
}
