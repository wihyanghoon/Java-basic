package access.b;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //public method
    public void deposit(int amount) {
        if(this.isAmountValid(amount)){
            this.balance += amount;
        } else {
            System.out.println("유효하지 않은 금액 입니다.");
        }
    }

    public void withdraw(int amount) {
        if(this.isAmountValid(amount) && this.balance - amount >= 0){
            this.balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return this.balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 큰 양수 값 이어야 한다.
        return amount > 0;
    }
}
