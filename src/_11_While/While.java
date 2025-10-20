package _11_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        while 반복문
//        조건이 참일 경우 무한 반복
//        for문과의 차이 => for문은 횟수 중심 / while문은 조건 중심

        /*
        * while (조건 => boolean 자료형) {
        *   반복할 코드
        * }
        *
        * caution) 반복할 코드 내에 조건 판단하는 구문이 포함되어 있어야!
        * */

//        1~5까지 출력
        int i = 1;
        while (i<=5) {
            System.out.println(i);
            i++;                            // 조건을 변경하기 위한 코드가 필요하다.
        }

        i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;                            // 조건을 변경하기 위한 코드가 필요하다.
        }

        i = 0;
        while (i >= 1) {                    // 조건 불만족으로 while 실행되지 않음
            System.out.println(i);
            i--;
        }

//        문제 1) 짝수만 출력 (1~10)
        i = 1;
        while (i <= 10) {
            if (i % 2 == 0) System.out.println(i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);

//        유효성 검사의 예) 정수를 입력한다 (1~100)
//        boolean flag = true;
//        while (flag) {
//            int score = scanner.nextInt();
//            if (score >= 0 && score <= 100) {
//                System.out.println("점수는 : " + score);
//                flag = false;               // break;와 같은 의미
//            } else System.out.println("다시 입력 하세요!!");
//        }

        int menu;
        boolean flag = true;

        while(flag) {
            System.out.println("메뉴를 선택 하세요");
            System.out.println("1. 주문하기");
            System.out.println("2. 취소하기");
            System.out.println("3. 재주문하기");
            System.out.print("메뉴를 고르세요 >>>>> ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("주문하기 메뉴");
                    break;                          // switch의 break!!
                case 2:
                    System.out.println("취소하기 실행");
                    break;                          // switch의 break!!
                case 3:
                    System.out.println("재주문하기 메뉴");
                    break;                          // switch의 break!!
                default:
                    System.out.println("다시 입력 하세요.");
                    continue;                       // while의 continue!!
            }
            break;
        }
//        문제 => 1 ~ 100까지 누적 합

        i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("누적합 : " + sum);

//        문제 1 ~ 100까지 식당 웨이팅
//        1번부터 차례로 입장 : "**번 손님 입장" 출력
//        10번 손님 입장할때 한정 메뉴 sold out
//        마지막에는 영업 종료

        i = 1;
        int soldOut = 10;

        while (i<=100) {
            System.out.print(i + "번 손님 : ");
            if (i == soldOut) {
                System.out.println("한정 메뉴 sold out!!");
                i++;
                break;
            } else System.out.println("한정 메뉴 제공.");
            i++;
        }

        System.out.println(i++ + "번 이후 영업 종료!");

//        문제 1 ~ 50번까지 웨이팅
//        메뉴가 20개까지 한정 판매 => "솔드 아웃 가게 샷다 내림"
//        14번 노쇼 => "**번 노쇼 발생!"
//        while문으로 구현
        i = 1;
        soldOut = 20;
        int noShow = 14;

        while (i<=50) {
            System.out.print(i + "번 손님 : ");
            if (i == noShow) {
                System.out.println("노쇼 발생!");
                soldOut++;
                i++;
                continue;
            } else if (i == soldOut) {
                System.out.println("한정 메뉴 sold out!!");
                i++;
                break;
            } else System.out.println("한정 메뉴 제공.");
            i++;
        }

        System.out.println(i++ + "번 이후 영업 종료!");

    }
}
