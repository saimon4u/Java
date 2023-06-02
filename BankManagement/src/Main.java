import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account savings1 = new SavingsAccount(1000,"a");
        Account savings2 = new SavingsAccount(1000,"b");
        Account savings3 = new SavingsAccount(1000,"c");
        Account current1 = new CurrentAccount(1000,"d");
        Account current2 = new CurrentAccount(1000,"e");
        Account current3 = new CurrentAccount(1000,"f");
        Bank BangladeshBank = new Bank();
        BangladeshBank.Add(savings3);
        BangladeshBank.Add(savings2);
        BangladeshBank.Add(savings1);
        BangladeshBank.Add(current1);
        BangladeshBank.Add(current2);
        System.out.println(savings1);
    }
}