import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Customer> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            String str;
            System.out.println("Enter Your Information String of " + (i+1) + " : ");
            str = sc.nextLine();
            String[] array = str.split(",",0);
            ArrayList <String> arr = new ArrayList<>();
            array[2] = array[2].replaceAll("[^0-9]","");
            for(String s : array) {
                s.trim();
                arr.add(s);
            }
            Customer cus = new Customer(arr.get(0),arr.get(1),arr.get(2));
            list.add(cus);
        }
        for(Customer c: list){
            String s = c.Name;
            if(s.startsWith("a") || s.startsWith("A"))
                System.out.println(c);
        }
    }
}