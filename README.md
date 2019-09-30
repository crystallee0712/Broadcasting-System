# Project Information

This project implements a notification system to send notifications about delivery requests to drivers who are subscribed to receive the update from a shop.

When a store gets a product delivery orders should be created at store and a delivery request should be broadcasted to all drivers.

# Project Design

1. Design Pattern

This system is using Observer Pattern to realize the functions of adding to the observers' list, removing from the observers' list and notifying all observers on the list.


2. Simplicity

This project is very straightforward and easy to understand.

    Observerable:

	Interface: Request
	Class: Shop implements Request
	Class: Order

    Observer:
	
	Interface: Drivers
	Class: Taxi
	Class: Van

As the subject, a Request interface is created, which contains three methods addObserver which adds the driver object to the notifying list, removeObserver, which removes a specific driver object from the notifying list and the driver will no longer receive any message from the broadcast, nofityObservers(), which notifies all drivers on the list.

Shop class is created to implement Request interface. An ArrayList is declared as the observers' list. It implements all methods in the Request interface. addObserver() will add driver to the list. removerObserver will remove driver from the list. notifyObservers() will traverse the drivers' list and pass in the order number, recipient's name, and order price. In addition, Shop class also has a setOrder method, which takes the Order object and calls the notifyObservers() method inside of it.

Order class creates orderNo(int), recipient(String) and orderPrice(double) as the fields and creates constructor and getter setter for each field.

Drivers interface has one method which is named as update(), which takes in the orderNo, recipient and orderPrice as parameters.

Taxi class and Van class have basically same design. They both implement Drivers interface. They both have orderNo, customerName and orderPrice as protected fields. The constructor is the driverName. It overrides the update() method and call display() method which is created in Taxi and Van classes. The display() method shows the driver's name, order number, recipient's name and order price.

3. Efficiency

    Since this project is implementing interface and extending interface Request and Drivers, several methods can be defined in the interface and in the abstract class, which reduces the duplicated code.

# How to compile the project

I use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```


# Run all the unit test classes.


```bash
mvn clean compile test

```


