
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Fruit orange = new Fruit("orange","normal",50,180);
        Fruit mango1 = new Fruit("mango","himshagar",50,100);
        Fruit mango2 = new Fruit("mango","lengra",50,180);
        Fruit lichi = new Fruit("lichi","normal",50,200);
        Fruit banana = new Fruit("banana","normal",50,150);
        ArrayList <Fruit> list = new ArrayList<>();
        list.add(orange);
        list.add(mango2);
        list.add(mango1);
        list.add(lichi);
        list.add(banana);
        User rafiq = new Seller("dhaka",list,"rafiq","islam","019846274");
//        User salam = new Seller("india",list,"salam","hossain","017843853");
        User saimon = new Buyer("dhaka",0.0,"saimon","bhuiyan","0140297348");
        Order order = ((Buyer)saimon).placeOrder((Seller)rafiq);
//        Delivery delivery = new Delivery(order);
        System.out.println(((Buyer) saimon).getRewards());
    }
}