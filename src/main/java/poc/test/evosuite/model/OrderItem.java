package poc.test.evosuite.model;

import java.util.Date;

public class OrderItem {

    private String itemId;
    private double price;
    private String itemName;
    private Date orderCreatedDate;

    public OrderItem(String itemId, double price, String itemName, Date orderCreatedDate) {
        this.itemId = itemId;
        this.price = price;
        this.itemName = itemName;
        this.orderCreatedDate = orderCreatedDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getOrderCreatedDate() {
        return orderCreatedDate;
    }

    public void setOrderCreatedDate(Date orderCreatedDate) {
        this.orderCreatedDate = orderCreatedDate;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
