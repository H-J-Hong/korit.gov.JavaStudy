package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        do-while 반복문
//        비교 -> while문 : 조건 확인후 실행
//        비교 -> do-while문 : 조건에 상관 없이 최초 1회 실행후 조건 검사 수행

        /*
        * do {
        *   반복할 코드 - 최초 1회 반드시 실행
        * } while (조건);
        *
        * ";" 빼먹지 말것!!
        * */

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        i = 10;
        do {                            // 조건이 거짓이라도 일단 한번은 실행 된다!
            System.out.println(i);
            i++;
        } while (i <= 5);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 주문하기");
            System.out.println("2. 취소하기");
            System.out.println("0. 종료하기");
            System.out.print("선택 : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("주문을 합니다.");
                    break;
                case 2 :
                    System.out.println("취소를 합니다.");
                    break;
                case 0 :
                    System.out.println("종료를 합니다.");
                    break;
                default :
                    System.out.println("올바른 번호를 입력하세요.");
            }
        } while (choice != 0);

//        1 ~ n 까지 반복하여 총합 구하기

        i = 1;
        System.out.print("***** 1~n까지 더하기. *****\nn을 입력하세요 >>>>> ");
        int n = scanner.nextInt();
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("결과 >>>>> "+ sum);


//        숫자 맞추기 게임

        int answer = (int)(Math.random()*100) + 1;
//        숫자를 입력 받아 answer를 맞추기
//        정답과 비교하여 업 또는 다운 출력
//        시도한 횟수를 정답 맞췄을때 같이 출력

        i = 0;
        int input;

        do {
            System.out.print("1~100 사이의 숫자를 입력하세요 >>>>> ");
            input = scanner.nextInt();

            i++;

            if (input > answer) System.out.println("다운!");
            else if (input < answer) System.out.println("업!");

        } while (input != answer);

        System.out.println("===== 정답 =====");
        System.out.println("시도 " + i + "회 만에 성공!");

    }
}
