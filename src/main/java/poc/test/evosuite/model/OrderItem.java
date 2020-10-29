package poc.test.evosuite.model;

import java.util.Date;

public class OrderItem {

    private long itemId;
    private double price;
    private double itemName;
    private Date orderCreatedDate;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getItemName() {
        return itemName;
    }

    public void setItemName(double itemName) {
        this.itemName = itemName;
    }

    public Date getOrderCreatedDate() {
        return orderCreatedDate;
    }

    public void setOrderCreatedDate(Date orderCreatedDate) {
        this.orderCreatedDate = orderCreatedDate;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
}