public class Product {
    private String upcCode;
    private String name;
    private double price;

    public Product(String upcCode, String name, double price) {
        this.upcCode = upcCode;
        this.name = name;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
