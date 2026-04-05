public class OnlineOrder extends Order {
    private String deliveryAddress;

    public OnlineOrder(int orderId, Customer customer, String address) {
        super(orderId, customer);
        this.deliveryAddress = address;
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("Online Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Address: " + deliveryAddress);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
}