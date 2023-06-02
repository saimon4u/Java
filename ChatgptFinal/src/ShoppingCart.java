import java.util.ArrayList;

public class ShoppingCart implements Discountable{
    private ArrayList<Product>list = new ArrayList<>();
    public void addProduct(Product product){
        list.add(product);
    }
    public void removeProduct(Product product){
        list.remove(product);
    }
    public void totalCost(){
        double totalcost = 0.0;
        for(Product product : list){
            totalcost += product.getPrice();
        }
        System.out.println("Total cost: " + totalcost);
    }

    @Override
    public void calculateDiscountablePrice() {
        double price = 0.0;
        boolean flag;
        for(Product product : list){
            flag = true;
            for(Product product1 : Discountable.list){
                if(product1==product){
                    flag = false;
                    price += product1.getPrice()*0.9;
                }
            }
            if(flag)price+=product.getPrice();
        }
        System.out.println("Total price after discount: " + price);
    }
}
