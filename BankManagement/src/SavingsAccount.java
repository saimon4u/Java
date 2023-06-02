public class SavingsAccount extends Account{
    SavingsAccount(double balance, String name) {
        super(balance, name);
    }
    @Override
    public void generateAccountTag(){
        super.AccountTag = "Savings";
    }
    @Override
    public void withdraw(double amount){
        if(amount < getBalance()){
            super.withdraw(amount);
        }
        else{
            System.err.println("You don't have enough money to withdraw.");
        }
    }
}
