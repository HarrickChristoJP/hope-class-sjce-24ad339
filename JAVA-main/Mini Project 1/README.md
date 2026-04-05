Order Tracking System (Java OOP Project)
Overview
This project is an Order Tracking System developed using Object-Oriented Programming (OOP) principles in Java. It simulates how customers place orders and track their status in real time.

Features
Customer creation

Order placement

Online orders & Store pickup orders

Order tracking system

Status updates (Processing → Shipped → Delivered)

Input validation and error handling

OOP Concepts Used
Encapsulation
Private attributes in classes

Access via constructors and getters

Inheritance
OnlineOrder and StoreOrder inherit from Order

Polymorphism
Method overriding (displayOrderDetails())

Abstraction
Order is an abstract class

Project Structure
text
OrderTrackingSystem/
│
├── src/
│   ├── Customer.java
│   ├── Order.java
│   ├── OnlineOrder.java
│   ├── StoreOrder.java
│   ├── OrderTracker.java
│   └── MainApp.java
│
├── README.md
└── .gitignore
How to Run
Prerequisites
Java JDK 8 or above

VS Code / IntelliJ / Eclipse

Steps
Open the project folder

Open terminal inside the folder

Compile:

text
javac src/*.java
Run:

text
java -cp src MainApp
Sample Output
text
Online Order ID: 101
Customer: Harrick
Address: Chennai
Status: Shipped
---------------------------

Store Order ID: 102
Customer: Alex
Pickup Location: Coimbatore
Status: Ready for Pickup
---------------------------
Class Description
Customer
Stores customer details (ID, Name)

Order (Abstract Class)
Base class containing common attributes (orderId, customer, status)

OnlineOrder
Handles delivery-based orders

StoreOrder
Handles store pickup orders

OrderTracker
Manages and displays all orders

MainApp
Main class to run the application

Error Handling
Prevents null or empty values

Throws IllegalArgumentException for invalid inputs

Future Enhancements
Add order cancellation

Add delivery date tracking

Notification system

Search orders by ID

Database integration (MySQL / MongoDB)

Contribution
Feel free to fork this repository and improve the project.

License
This project is open-source and free to use.

Author
Harrick Christo J.P
B.Tech Artificial Intelligence & Data Science (SJCE)
312324243074
