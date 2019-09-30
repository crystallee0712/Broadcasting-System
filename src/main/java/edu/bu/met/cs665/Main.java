package edu.bu.met.cs665;

// import org.apache.log4j.PropertyConfigurator;

import edu.bu.met.cs665.Observable.Order;
import edu.bu.met.cs665.Observable.Shop;
import edu.bu.met.cs665.Observer.Drivers;
import edu.bu.met.cs665.Observer.Taxi;
import edu.bu.met.cs665.Observer.Van;

public class Main {

//  private static Logger logger = Logger.getLogger(Main.class);
//

  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {
      Shop shop = new Shop();

    Drivers driver1 = new Taxi("David");
    Drivers driver2 = new Taxi("Bob");
    Drivers driver3 = new Taxi("Adam");
    Drivers driver4 = new Van("Alice");
    Drivers driver5 = new Van("Jason");


    shop.addObserver(driver1);
    shop.addObserver(driver2);
    shop.addObserver(driver3);
    shop.addObserver(driver4);
    shop.addObserver(driver5);

    Order order = new Order(1235, "Andy Williams", 12.58);
    shop.setOrder(order);



  }


}
