package edu.bu.met.cs665.Observable;

/**
 * This Class Represents a single order details.
 *
 * @author Hui Li
 */

public class Order {
    private int orderNo;
    private String recipient;
    private double orderPrice;

    /**
     * Create an order item based on attributes.
     *
     * @param orderNo order number
     * @param recipient recipient's name
     * @param orderPrice order price
     */
    public Order(int orderNo, String recipient, double orderPrice) {
        this.orderNo = orderNo;
        this.recipient = recipient;
        this.orderPrice = orderPrice;
    }
    /**
     * Getter method for order number.
     *
     * @return order number
     */
    public int getOrdrNo() {
        return orderNo;
    }

    /**
     * A setter method for order number.
     *
     * @param orderNo order number
     */

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * Getter method for recipient .
     *
     * @return recipient
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * A setter method for recipient name.
     *
     * @param recipient recipient name
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * Getter method for order price.
     *
     * @return order price
     */
    public double getOrderPrice() {
        return orderPrice;
    }

    /**
     * A setter method for order price.
     *
     * @param orderPrice order price
     */
    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }


}
