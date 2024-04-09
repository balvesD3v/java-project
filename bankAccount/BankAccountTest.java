package bankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setNumber("134"); 
        bankAccount.setHolder("Luiz");
        bankAccount.setBalance(1.998);

        bankAccount.deposits(9999);
        bankAccount.withdraw(11983);
    }
}
