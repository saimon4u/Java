public class Electronics extends Product{
    private String brand;
    private int warranty;

    public Electronics(String productId, String name, double price, String brand, int warranty) {
        super(productId, name, price);
        this.brand = brand;
        this.warranty = warranty;
    }
    @Override
    public double calculateDiscountPrice(Product product){
        double price = product.getPrice() * .90;
        return price;
    }
}
