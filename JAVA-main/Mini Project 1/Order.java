public abstract class Order {
    protected int orderId;
    protected Customer customer;
    protected String status;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.status = "Processing";
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public abstract void displayOrderDetails();
}