package class1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance = balance - amount;
        }
    }

    void printBalance() {
        System.out.println("잔고 : " + balance);
    }
}
