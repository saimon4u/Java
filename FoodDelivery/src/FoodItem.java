public class FoodItem {
    private String name;
    private double price;

    FoodItem(String name,double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "->" + price + "\n";
    }

    public String getName() {
        return name;
    }
}
