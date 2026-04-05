public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}