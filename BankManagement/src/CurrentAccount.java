public class CurrentAccount extends Account{
    CurrentAccount(double balance, String name) {
        super(balance, name);
        setInterestRate(0.05);
    }
    @Override
    public void generateAccountTag(){
        super.AccountTag = "current";
    }
}
