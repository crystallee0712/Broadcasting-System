package edu.bu.met.cs665;

import edu.bu.met.cs665.Observable.Order;
import edu.bu.met.cs665.Observable.Shop;
import edu.bu.met.cs665.Observer.Drivers;
import edu.bu.met.cs665.Observer.Taxi;
import edu.bu.met.cs665.Observer.Van;
import org.junit.Test;

public class TestRequest {


    private Drivers driver1 = new Taxi("David");
    private Drivers driver2 = new Taxi("Bob");
    private Drivers driver3 = new Taxi("Adam");
    private Drivers driver4 = new Van("Alice");
    private Drivers driver5 = new Van("Jason");


    /**
     * The first test is testing the method addObserver by adding 5 drivers to the list using Shop object to add.
     * The new order is declared with orderNo, recipient name and order price.
     * All drivers in the observer list will get the notification from the shop when setOrder(order) method is called
     */

    @Test
    public void testRequest_1(){

        System.out.println("This is Junit test 1");
        System.out.println("---------------------");
        Order order = new Order(1235, "Andy Williams", 12.58);
        Shop shop = new Shop(order);
        shop.addObserver(driver1);
        shop.addObserver(driver2);
        shop.addObserver(driver3);
        shop.addObserver(driver4);
        shop.addObserver(driver5);


        shop.setOrder(order);

    }


    /**
     * The second test is first testing the method addObserver by adding 5 drivers to the list using Shop object to add.
     * Then one of the drivers is removed from the observer list by calling removeObserver() with Shop object
     * The new order is declared with orderNo, recipient name and order price.
     * All drivers (except the one who has been removed from the list) in the observer list will get the notification from the shop when setOrder(order) method is called
     */

    @Test
    public void testRequest_2(){

        System.out.println("This is Junit test 2");
        System.out.println("---------------------");
        Order order = new Order(1358, "Lily Woodward", 39.09);
        Shop shop = new Shop(order);
        shop.addObserver(driver1);
        shop.addObserver(driver2);
        shop.addObserver(driver3);
        shop.addObserver(driver4);
        shop.addObserver(driver5);

        shop.removeObserver(driver1);


        shop.setOrder(order);
    }
    /**
     * The third test is first testing the method addObserver by adding 5 drivers to the list using Shop object to add.
     * Then create another driver with a van driver.
     * The new order is declared with orderNo, recipient name and order price.
     * All drivers (except the one who has been removed from the list) in the observer list will get the notification from the shop when setOrder(order) method is called
     */

    @Test
    public void testRequest_3(){

        System.out.println("This is Junit test 3");
        System.out.println("---------------------");

        Order order = new Order(1367, "Dan White", 25.89);
        Shop shop = new Shop(order);
        shop.addObserver(driver1);
        shop.addObserver(driver2);
        shop.addObserver(driver3);
        shop.addObserver(driver4);
        shop.addObserver(driver5);

        Drivers driver6 = new Van("Eric");
        shop.addObserver(driver6);


        shop.setOrder(order);
    }
}
