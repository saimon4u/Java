public class Main {
    public static void main(String[] args) {
        Product physics = new Book("a",12,"dsf","dsfe",500);
        Product chemistry = new Book("b",13,"sfef","sfse",500);
        Product mobile = new Electronics("3ewef","samsung",12500,"samsung",36);
        Product bike = new Electronics("3ewef","samsung",150000,"samsung",231);
        Discountable.list.add(bike);
        Discountable.list.add(chemistry);
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(bike);
        sc.addProduct(physics);
        sc.addProduct(chemistry);
        sc.removeProduct(chemistry);
        sc.totalCost();
        sc.calculateDiscountablePrice();
    }
}