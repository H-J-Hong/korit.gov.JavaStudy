package _16_Class.BankAccount;

import java.util.Scanner;

public class BankAccountMain {
    /*
    * 문제)
    * 1. BankAccount의 필드는 balance(잔액)를 가진다
    * 2. 클래스 선언시 balance에 값 주입, "계좌가 개설되었습니다. 현재 잔액 ***** 원" 출력
    * 3. balance의 값을 볼 수 있는 게터 생성
    * 4. deposit, whitdraw 메소드 생성
    * 5. deposit - 입금 동작 메소드 => 0원 이상일때만 작동하도록, "계좌에 *****원이 입금되었습니다. 현재 잔액 : *****원" 출력
    * 6. withdraw - 출금 동작 메소드 => 0원 이상, 잔액 이하일때만 작동하도록 "계좌에 *****원이 출금되었습니다. 현재 잔액 : *****원" 출력
    * 7. 출금액이 0원 미만이면 "출금액은 0원 초과이어야 합니다." 출력
    * 8. 출금액이 잔액보다 많을 경우 "잔액이 부족합니다. 현재 잔액 : ***** 원" 출력
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("계좌 개설 입금 금액 >>>>> ");
        int b = scanner.nextInt();
        BankAccount newAccount = new BankAccount(b);

        while (true) {
            System.out.println();
            System.out.println("***** 은행에 오신것을 환영합니다. *****");
            System.out.println("1. 잔액 조회");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("0. 업무 완료");
            System.out.print("수행할 업무를 입력하세요. >>>>> ");
            int a = scanner.nextInt();

            if (a < 0 || a > 3) {
                System.out.println("다시 입력 하세요.");
            } else if (a == 1) {
                newAccount.getBalance();
            } else if (a == 2) {
                System.out.print("입금 금액을 입력하세요. >>>>> ");
                int n = scanner.nextInt();
                newAccount.deposit(n);
            } else if (a == 3) {
                System.out.print("출금 금액을 입력하세요. >>>>> ");
                int n = scanner.nextInt();
                newAccount.withdraw(n);
            } else if (a == 0) {
                System.out.println("안녕히 가십시오.");
                break;
            }
        }

    }
}
