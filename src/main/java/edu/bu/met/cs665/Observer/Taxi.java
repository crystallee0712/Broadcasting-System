package edu.bu.met.cs665.Observer;

public class Taxi implements Drivers{

    protected int orderNo;
    protected String customerName;
    protected double orderPrice;



    private String driverName;

    public Taxi(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void update(int orderNo, String customerName, double orderPrice){
        this.orderNo = orderNo;
        this.customerName = customerName;
        this.orderPrice = orderPrice;
        display();
    }

    private void display(){
        System.out.println("Taxi driver " + driverName + " is getting the request with order no " + orderNo +
                " and order price "+ orderPrice + " delivering to " + customerName);
    }
}
