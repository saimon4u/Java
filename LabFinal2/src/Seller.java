import java.util.ArrayList;

public class Seller extends User{
    public String address;
    private ArrayList <Fruit> list = new ArrayList<>();
    public Seller(String address,ArrayList<Fruit>list,String firstName,String lastName,String phoneNumber){
        super(firstName,lastName,phoneNumber);
        this.address = address;
        this.list = list;
    }

    public ArrayList<Fruit> getList() {
        return list;
    }
}
