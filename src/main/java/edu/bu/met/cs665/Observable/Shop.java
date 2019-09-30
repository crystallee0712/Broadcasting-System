package edu.bu.met.cs665.Observable;

import edu.bu.met.cs665.Observer.Drivers;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Request {

    private Order order;
    private List<Drivers> driversList = new ArrayList<>();

    /**
     * Register a driver to receive messages from the order request changes
     */
    @Override
    public void addObserver(Drivers driver) {
        driversList.add(driver);
    }

    /**
     * Removes a driver from the drivers list. The driver will be unsubscribed
     */
    @Override
    public void removeObserver(Drivers driver) {
        driversList.remove(driver);
    }

    /**
     * Notifies all of the drivers that are registered and added to the list.
     */
    @Override
    public void notifyObservers() {
        for (Drivers driver : driversList){
            driver.update(order.getOrdrNo(), order.getRecipient(), order.getOrderPrice());
        }

    }
    /**
     * A setter method for order, all subscribed drivers will be notified
     */
    public void setOrder(Order order){
        this.order = order;
        notifyObservers();
        System.out.println("******************************************************************************");
    }

    /**
     * A getter method for order
     */
    
    public Order getOrder(){
        return this.order;
    }
}
