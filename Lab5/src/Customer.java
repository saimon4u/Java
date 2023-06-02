import java.awt.*;

public class Customer {
    String Name;
    String Address;
    String Number;
    Customer(String Name,String Address,String Number){
        this.Name = Name;
        this.Address = Address;
        this.Number = Number;
    }
    @Override
    public String toString(){
        String n = String.format("Customer Name: %s",Name);
        String a = String.format("Email Address: %s",Address);
        String num = String.format("Phone number: %s",Number);
        return n + "\n" + a + "\n" +num;
    }
}
