package _10_For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        /*
        * 반복문 - for
        *
        *
        * for (선언 ; 조건 ; 증감 ) {
        *   반복될 코드
        * }
        * */

        for (int i = 0 ; i < 10 ; i++) {                        // i 는 "반복문 내에서만 유효한 변수"
            System.out.println("Hello World! " + i);
        }
        for (int i = 10 ; i > 0 ; i--) {                        // i 는 "반복문 내에서만 유효한 변수"
            System.out.println("Hello World! " + i);
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("ㅎㅇ" + i);
        }
        for (int i = 0; i <= 50; i++) {                         // i가 짝수일때만 (1)
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i < 51; i += 2) {                       // i가 짝수일때만 (2)
            System.out.println(i);
        }

        System.out.println("========================================== 문제1");

//        문제 1)
//        1~100까지 다 더한 총합을 구하시오.
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100까지 모두 더한 총합을 구하시오. >>>>> " + sum);

        System.out.println("========================================== 문제2");

//        문제 2)
//        1~100까지 중에 짝수만 더한 총합을 구하시오
        sum = 0;
        for (int i = 2; i <= 100 ; i += 2) {
            sum += i;
        }
        System.out.println("1~100까지 중에 짝수만 더한 총합을 구하시오 >>>>> " + sum);

        System.out.println("========================================== 문제3");

//        문제 3)
//        특정 단을 입력 받아서 1~9까지 구구단 출력 하기
        Scanner scanner = new Scanner(System.in);

        System.out.println("단수를 입력하세요 >>>>> ");
        int numDan = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= 9 ; i++) {
            System.out.println(numDan + " * " + i + " = " + numDan * i);
        }

        System.out.println("========================================== 문제4");

//        문제 4)
//        구구단 전체를 출력하시오.
        for (int i = 1; i <= 9; i++) {
            System.out.println(">>>>> " + i + " 단 <<<<<");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        System.out.println("========================================== 문제5");

        /*
        * 문제 5)
        * *
        * **
        * ***
        * ****
        * *****
        * */

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("========================================== 문제6");

        /*
        * 문제 6)
        * *****
        * ****
        * ***
        * **
        * *
        * */

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("==========================================");
//        break, continue
//        break : 조건문과 겹쳐서 조건 만족시 반복을 끝낼 수 있도록
//        continue : 조건문과 겹쳐서 조건 만족시 다음 루틴부터 재시작

        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;                                  // i가 5일때 반복 종료
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;                               // i가 5일때 다시 첫줄부터 시작 (6부터 재시작)
            System.out.println(i);
        }

        System.out.println("========================================== 문제7");

//        문제 7)
//        1~50까지 숫자 중 3의 배수 빼고 출력하기
//        단 3의 배수는 " " 출력으로 대체

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {                                       // 3의 배수
                System.out.println(" ");
                continue;
            }
            System.out.println(i);
        }

        System.out.println("========================================== 문제8");

//        문제 8)
//        1부터 계속 합계를 구하되 합계가 200이 넘어가는 순간 루프 스탑
//        마지막은 최종 합과 마지막으로 더한 수를 출력
        sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 200) {
                System.out.println("최종합 >>>>> " + sum);
                System.out.println("마지막으로 더한 수 >>>>> " + i);
                break;
            }
        }

        System.out.println("========================================== 문제9");

//        문제 9)
//        1부터 100까지 수 중에 3의 배수와 5의 배수의 갯수를 각각 출력하시오

        int m3 = 0;
        int m5 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) m3++;
            if (i % 5 == 0) m5++;
        }
        System.out.println("3의 배수 >>>>> " + m3);
        System.out.println("5의 배수 >>>>> " + m5);

        System.out.println("========================================== 문제10");

//        문제 10)
//        정수 5개를 입력 받고  입력 받은 수 중 가장 큰 값을 출력하시오.
//        1~100 사이 숫자만 입력 받고, 입력 값이 범위를 벗어나는 경우 "범위를 벗어났습니다." 출력후 스탑

        int maxnum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " 번째 입력 : ");
            int num1 = scanner.nextInt();
            if (num1 < 1 || num1 > 100) {
                System.out.println("범위를 벗어났습니다.");
                break;
            } else if (maxnum < num1) maxnum = num1;
            System.out.println();
        }
        System.out.println("최대 숫자 : " + maxnum);


        System.out.println("========================================== 문제11");

//        문제 11)
//        숫자를 입력받아 팩토리얼 구하기.
//        1~10 사이 숫자만 입력 받음 (int 자료형의 overflow 방지)

        System.out.print("1 ~ 10사이 숫자 입력 >>>>> ");
        int num2 = scanner.nextInt();
        System.out.println();
        int fact = 1;
        for (int i = 2; i <= num2 ; i++) {
            fact *= i;
        }
        System.out.println(num2 + "의 팩토리얼 >>>>> " + fact);

        System.out.println("========================================== 문제12");

//        문제 12)
//        1. 1 ~ 50 까지 숫자 출력
//        2. 3, 6, 9가 들어가면 박수 출력
//        3. 5가 들어가면 으악 출력

        int num3 = 0;
        int flag = 0;
        for (int i = 1; i <= 50 ; i++) {
            flag = 0;
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                System.out.print("박수");
                flag = 1;
            } else if (i % 10 == 5) {
                System.out.print("으악");
                flag = 1;
            }

            if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.print("박수");
                flag = 1;
            }

            if (i / 10 == 5) {
                System.out.print("으악");
                flag = 1;
            }

            if (flag == 0) System.out.print(i);
            System.out.println();
        }






    }
}
