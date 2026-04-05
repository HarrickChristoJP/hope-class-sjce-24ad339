public class StoreOrder extends Order {
    private String storeLocation;

    public StoreOrder(int orderId, Customer customer, String location) {
        super(orderId, customer);
        this.storeLocation = location;
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("Store Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Pickup Location: " + storeLocation);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
}