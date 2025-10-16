package _08_If;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
//        조건문 => if문
        /*
        * if (조건) {
        *   조건이 참일때 실행될 코드
        * }
        */
        Scanner scanner = new Scanner(System.in);

//        int height = scanner.nextInt();
        int height = 150;
//        키가 120 이상이면 "탑승 가능" 출력
        if (height >= 120) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        System.out.println("====================== 3항 연산자");

//        3항 연산자 활용
        System.out.println(height >= 120 ? "탑승 가능" : "탑승 불가능");

        System.out.println("====================== 이중 조건");

//        키가 120이상 이면서 어린이인 경우만 탑승 가능
        boolean isKid = true;
        if (height >= 120 && isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }
//        키가 120이상 이거나 어린이인 경우 탑승 가능
        if (height >=120 || isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        System.out.println("====================== 문제 풀이");

//        문제 1 : 3의 배수인지 판단하여 맞으면 "3의 배수입니다." 출력
        int num = 12;
        if(num % 3 == 0) {
            System.out.println("3의 배수 입니다.");
        }

//        문제 2 : 절댓값을 출력
        int num2 = -12;
        if(num2 >= 0) {
            System.out.println(num2);
        } else {
            System.out.println(-num2);
        }

//        문제 3 : 최댓값을 출력
        int num3 = 12;
        int num4 = 8;
        if(num3 >= num4) {
            System.out.println(num3);
        } else {
            System.out.println(num4);
        }

//      문제 4 : 아이디 비밀번호 확인하여 맞으면 "로그인 확인" 출력, 아이디가 틀리면 "아이디가 틀렸습니다.", 비밀번호가 틀리면 "비밀번호가 틀렸습니다." 출력
        String userId = "myid1234";
        String userPw = "qwer1234";

        System.out.println("아이디 >>>>>");
        String inputId = scanner.nextLine();
        System.out.println("비밀번호 >>>>>");
        String inputPw = scanner.nextLine();

        System.out.println(inputId + "\n" + inputPw);

        if(inputId.equals(userId)) {
            if (inputPw.equals(userPw)) {
                System.out.println("로그인 확인.");
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("아이디가 틀렸습니다.");
        }




    }
}
