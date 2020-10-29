package poc.test.evosuite.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {

    private UUID orderId;
    private List<OrderItem> orderItemList;
    private String orderName;
    private double totalPrice;
    private Date orderCreationDate;

    public Order(UUID orderId, String orderName, Date orderCreationDate) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderCreationDate = orderCreationDate;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderCreationDate() {
        return orderCreationDate;
    }

    public void setOrderCreationDate(Date orderCreationDate) {
        this.orderCreationDate = orderCreationDate;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }
}
