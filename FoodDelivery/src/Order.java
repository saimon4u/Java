import java.util.ArrayList;

public class Order implements Promotion{
    private ArrayList <FoodItem> items = new ArrayList<>();
    private double totalcost=0.0;
    public void addItem(FoodItem foodItem){
        items.add(foodItem);
    }
    public void removeItem(FoodItem foodItem){
        items.remove(foodItem);
    }
    public void calculateTotalCost(){
        for(FoodItem foodItem: items){
            totalcost += foodItem.getPrice();
        }
    }

    public ArrayList<FoodItem> getItems() {
        return items;
    }

    public double getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(double totalcost) {
        this.totalcost = totalcost;
    }
    @Override
    public void applyPromotion(Order order) {
        this.setTotalcost(this.getTotalcost()*0.9);
    }
}
