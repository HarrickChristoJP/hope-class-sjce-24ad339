import java.util.*;

// ENUM for Order Status
enum OrderStatus {
    PLACED, SHIPPED, OUT_FOR_DELIVERY, DELIVERED
}

// Product Class
class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

// Abstract Payment Class
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid payment amount");
        }
        this.amount = amount;
    }

    abstract void processPayment();
}

// Card Payment
class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    void processPayment() {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

// UPI Payment
class UpiPayment extends Payment {
    public UpiPayment(double amount) {
        super(amount);
    }

    void processPayment() {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Cash on Delivery
class CashOnDelivery extends Payment {
    public CashOnDelivery(double amount) {
        super(amount);
    }

    void processPayment() {
        System.out.println("Cash on Delivery: ₹" + amount);
    }
}

// Order Class
class Order {
    private int orderId;
    private List<Product> products;
    private OrderStatus status;
    private double totalAmount;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.status = OrderStatus.PLACED;
        this.totalAmount = 0;
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        products.add(product);
        totalAmount += product.getPrice();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void updateStatus(OrderStatus status) {
        this.status = status;
    }

    public void displayOrder() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Status: " + status);
        System.out.println("Products:");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " (₹" + p.getPrice() + ")");
        }
        System.out.println("Total Amount: ₹" + totalAmount);
    }
}

// User Class
class User {
    private int userId;
    private String name;
    private List<Order> orders;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }
        orders.add(order);
    }
}

// Main Class (Single File Execution)
public class OrderTrackingSystem {
    public static void main(String[] args) {

        try {
            // Create Products
            Product p1 = new Product(1, "Laptop", 50000);
            Product p2 = new Product(2, "Mouse", 500);

            // Create User
            User user = new User(101, "Harrick");

            // Create Order
            Order order = new Order(1001);
            order.addProduct(p1);
            order.addProduct(p2);

            // Place Order
            user.placeOrder(order);

            // Choose Payment Method (Polymorphism)
            Payment payment = new UpiPayment(order.getTotalAmount());
            payment.processPayment();

            // Update Order Status
            order.updateStatus(OrderStatus.SHIPPED);

            // Display Order Details
            order.displayOrder();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}