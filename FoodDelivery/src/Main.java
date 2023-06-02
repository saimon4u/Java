public class Main {
    public static void main(String[] args) {
        FoodItem one = new FoodItem("CheeseBurger",200);
        FoodItem two = new FoodItem("Pizza",600);
        FoodItem three = new FoodItem("Pasta",250);
        Restaurant BurgerKing = new Restaurant("BurgerKing");
        BurgerKing.addItemToMenu(one);
        BurgerKing.addItemToMenu(two);
        BurgerKing.addItemToMenu(three);
        BurgerKing.displayMenu();
        Order first = new Order();
        first.addItem(one);
        first.addItem(two);
        System.out.println("Order contents: ");
        for(FoodItem foodItem : first.getItems()){
            System.out.println(foodItem);
        }
        first.calculateTotalCost();
        System.out.println("Total cost is: " + first.getTotalcost());
        first.applyPromotion(first);
        System.out.println("Total cost after applying discount: " + first.getTotalcost());
    }
}