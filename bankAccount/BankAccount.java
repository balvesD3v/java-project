package bankAccount;

public class BankAccount {
    private String number;
    private String holder;
    private double balance;

    public BankAccount() {
        this.number = "1.999";
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return this.number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    // Deposits
    void deposits(double value) {
        if (value > 0) {
            balance = balance + value;
            // System.out.println("Deposits: " + balance);
        } else {
            // System.out.println("Deposits a value more than zero");
        }
    }

    // Withdraw 
    void withdraw(double value) {
        if (value > 0 && value <= balance) {
            balance = balance - value;
            // System.out.println("withdraw de " + value + " balance is " + balance);
        }
    }
}
