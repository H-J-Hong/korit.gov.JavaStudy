package _08_If;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        else if
        /*
        * if (조건) {
        *   조건에 맞을때 실행될 코드
        * } else if (추가조건) {
        *   조건에 맞지 않으나 추가조건에 맞을때 실행될 코드
        * } else {
        *   조건, 추가조건 모두 맞지 않을때
        * }
        * */

        /*
        * 문제1
        * 90점 이상 A
        * 80점 이상 B
        * 70점 이상 C
        * 나머지 D
        * */
        int avgScore = 77;
        if (avgScore >= 90) {
            System.out.println("A");
        } else if (avgScore >= 80) {
            System.out.println("B");
        } else if (avgScore >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

//        사분면
//        x, y를 입력 받으세요
//        입력 받은 좌표가 몇 사분면에 존재하는지 출력하시오.
        System.out.println("X좌표값 >>>>>");
        int x = scanner.nextInt();
        System.out.println("Y좌표값 >>>>>");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("3사분면");
        } else if (x > 0 && y < 0) {
            System.out.println("4사분면");
        } else if (x == 0 && y != 0) {
            System.out.println("Y축");
        } else if (x != 0 && y == 0) {
            System.out.println("X축");
        } else {
            System.out.println("원점");
        }

    }
}
