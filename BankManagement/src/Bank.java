import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
    protected ArrayList <Account> list;
    Bank(){
        list = new ArrayList<>();
    }
    public void Add(Account account_name){
        list.add(account_name);
        System.out.println("Account added!");
    }
    public void Remove (String Tag){
        list.removeIf(account -> account.getAccountTag() == Tag);
    }
}
