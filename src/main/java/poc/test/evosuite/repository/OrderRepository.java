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
}
