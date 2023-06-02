abstract public class Product{
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    abstract double calculateDiscountPrice(Product product);

    @Override
    public String toString() {
        return "Product Name: " + name + "\n" +
                "Product ID: " + productId + "\n" +
                "Price: " + price + "\n";
    }
}
