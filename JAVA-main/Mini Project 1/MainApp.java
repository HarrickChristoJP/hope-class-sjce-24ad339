public class MainApp {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Harrick");
        Customer c2 = new Customer(2, "Alex");

        Order o1 = new OnlineOrder(101, c1, "Chennai");
        Order o2 = new StoreOrder(102, c2, "Coimbatore");

        o1.updateStatus("Shipped");
        o2.updateStatus("Ready for Pickup");

        OrderTracker tracker = new OrderTracker();
        tracker.addOrder(o1);
        tracker.addOrder(o2);

        tracker.showAllOrders();
    }
}