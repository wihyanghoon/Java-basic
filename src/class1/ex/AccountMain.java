package class1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        // 만원을 입급한다.
        account.deposit(10000);
        // 구천원을 출금한다.
        account.withdraw(9000);
        // 이천원을 출금하고 잔액이 부족 할 경우 잔액 부족하다고 출력
        account.withdraw(2000);
        // 계좌금액을 출력한다
        account.printBalance();
    }
}
