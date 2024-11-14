package abstractpackage2;

public abstract class BankAccount {

    private String accountNumber;
    private double amount;

    public BankAccount(String accountNumber,double amount){

    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract void deposit();

    public abstract void withdraw();
}
