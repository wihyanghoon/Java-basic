package access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(400);
        System.out.println("잔액은 : " + account.getBalance());
    }
}
