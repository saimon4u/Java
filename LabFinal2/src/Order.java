import java.util.ArrayList;

public class Order {
    private ArrayList <Fruit> list = new ArrayList<>();
    public int quantityInKg;
    public Seller seller;
    public Buyer buyer;
    public Order(Seller seller,Buyer buyer,int quantityInKg,ArrayList<Fruit> list){
        this.seller = seller;
        this.buyer = buyer;
        this.quantityInKg = quantityInKg;
        this.list = list;
    }

    public ArrayList<Fruit> getList() {
        return list;
    }
}
