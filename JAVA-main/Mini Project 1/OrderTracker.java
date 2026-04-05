import java.util.ArrayList;

public class OrderTracker {
    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void showAllOrders() {
        for (Order order : orders) {
            order.displayOrderDetails(); // Polymorphism
        }
    }
}