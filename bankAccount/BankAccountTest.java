package bankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setNumber("134"); 
        bankAccount.setHolder("Luiz");
        bankAccount.setBalance(1.998);

        System.out.println("Before the deposit " + bankAccount.balance);
        bankAccount.deposits(9999);
        System.out.println("After the deposit " + bankAccount.balance);

        bankAccount.withdraw(11983);
        System.out.println("After the withdraw " + bankAccount.balance);

        if (bankAccount.balance < 0) {
            System.out.println("Failed");
        }
    }
}
