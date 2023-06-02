import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Buyer extends User{
    public String address;
    private double rewards;
    private Order order;
    public Buyer(String address,double rewards,String firstName,String lastName,String phoneNumber){
        super(firstName,lastName,phoneNumber);
        this.address = address;
        this.rewards = rewards;
    }

    public double getRewards() {
        return rewards;
    }

    public void setRewards(double rewards) {
        this.rewards = rewards;
    }


//    public Order placeOrder(Seller seller){
//        for(Fruit fruit: seller.list){
//            System.out.println(fruit);
//        }
//        String name;
//        int Quantity;
//        System.out.print("Enter the name of the fruit you want: ");
//        Scanner sc = new Scanner(System.in);
//        name = sc.nextLine();
//        System.out.print("Enter the quantity (Kg): ");
//        Quantity = sc.nextInt();
//        boolean flag = true;
//        for(Fruit fruit: seller.list){
//            if(fruit.getName().equals(name)){
//                if(fruit.getTotalQuantityKg()==0){
//                    NoFruitsException exception = new NoFruitsException();
//                    break;
//                }
//                flag = false;
//                Order order = new Order(seller,this,Quantity,fruit);
//                return order;
//            }
//        }
//        if(flag){
//            NoFruitsException exception = new NoFruitsException();
//        }
//        return null;
//    }
    public Order placeOrder(Seller seller){
        for(Fruit fruit : seller.getList()){
            System.out.println(fruit);
        }
        Scanner sc = new Scanner(System.in);
        ArrayList <Fruit> list = new ArrayList<>();
        int amount;
        System.out.print("Enter how many fruit do you want to buy: ");
        amount = sc.nextInt();
        while(amount>0){
            String name;
            int choice;
            System.out.print("Enter the fruit name: ");
            name = sc.next();
            for(Fruit fruit : seller.getList()){
                if(fruit.getName().equals(name)){
                    list.add(fruit);
                }
            }
            amount--;
        }
        int quantity;
        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();
        sc.nextLine();
        order= new Order(seller,this,quantity,list);
        return order;
    }
}
