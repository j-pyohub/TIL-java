package ex.oop;

public class Account {
    int balance = 0; //잔액

    void deposit(int amount) { // 입금 매서드
        balance += amount;
    }

    void withdraw(int amount) {// 출금 매서드
        if (balance - amount < 0) {
            System.out.println("잔액 부족");
            System.out.println("잔고: " + balance);
        } else {
            balance -= amount;
        }
    }
}
