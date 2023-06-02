public abstract class Account implements Closeable{
    private double balance;
    private double interestRate;
    protected String AccountTag;
    private String name;
        Account(double balance,String name){
        this.balance = balance;
        this.name = name;
        generateAccountTag();
    }
    public void ban(){
        this.balance = 0.0;
        this.interestRate = 0.0;
        this.name = "";
        this.AccountTag = "";
    }
    public void applyInterest(){
        balance += balance * interestRate;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

    public String getName() {
        return name;
    }

    public double getBalance(){
        return balance;
    }
    protected abstract void generateAccountTag();
    public String getAccountTag(){
        return AccountTag;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Tag: " + getAccountTag() + "\n";
    }
}
