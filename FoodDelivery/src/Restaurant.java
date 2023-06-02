import java.util.ArrayList;

public class Restaurant{
    private String name;
    private ArrayList <FoodItem> menu = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addItemToMenu(FoodItem foodItem){
        menu.add(foodItem);
    }
    public void removeItemToMenu(FoodItem foodItem){
        menu.remove(foodItem);
    }
    public void displayMenu(){
        System.out.println("MENU");
        for(FoodItem foodItem : menu){
            System.out.println(foodItem);
        }
    }
}
