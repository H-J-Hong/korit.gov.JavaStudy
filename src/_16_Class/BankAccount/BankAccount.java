package _16_Class.BankAccount;

import java.util.Scanner;

public class BankAccount {
    private int balance;

    Scanner scanner = new Scanner(System.in);

    public BankAccount(int balance) {
        System.out.println("계좌가 개설되었습니다. 현재 잔액 : " + balance + " 원");
        this.balance = balance;
    }

    public int getBalance() {
        System.out.println("현재 잔액 : " + balance + " 원");
        return balance;
    }

    public void deposit(int n) {
        if (n <= 0) System.out.println("입금액은 0원 초과이어야 합니다.");
        else {
            this.balance += n;
            System.out.println("계좌에 " + n + "원이 입금 되었습니다. 현재 잔액 :" + balance + " 원");
        }
    }

    public void withdraw(int n) {
        if (n <= 0) System.out.println("출금액은 0원 초과이어야 합니다.");
        else if (n > balance) System.out.println("잔액이 부족합니다. 현재 잔액 :" + balance + " 원");
        else {
            this.balance -= n;
            System.out.println("계좌에 " + n + "원이 출금 되었습니다. 현재 잔액 :" + balance + " 원");
        }
    }
}
