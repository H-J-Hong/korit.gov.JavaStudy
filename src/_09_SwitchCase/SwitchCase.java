package _09_SwitchCase;

import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
//        switch - case - default
//        * break 키워드를 만나기 전까지 계속 실행 *

//        Case)
//        1등이면 전액 장학금
//        2등이면 반액 장학금
//        3등이면 소정의 상금
//        4등 이하 박수

        int ranking = 2;
//        if (ranking == 1) {
//            System.out.println("전액 장학금");
//        } else if (ranking == 2) {
//            System.out.println("반액 장학금");
//        } else if (ranking == 3) {
//            System.out.println("소정의 상금");
//        } else {
//            System.out.println("박수");
//        }

        switch (ranking) {
            case 1 :
                System.out.println("전액 장학금");
                break;                              // break가 없을때, ranking == 1을 만족하면 이후 코드 전부 실행
            case 2 :
                System.out.println("반액 장학금");
                break;
            case 3 :
                System.out.println("소정의 상금");
                break;
            default :                               // 모든 케이스를 만족하지 않을때
                System.out.println("박수 쳐줌");
        }

//        2, 3등이 둘 다 반액 장학금인 경우

        switch (ranking) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :                                // 2에서 멈추지 않고 3을 실행후 break
            case 3 :                                // case 다음에는 조건식 불가, 값 하나만 적용 가능.
                System.out.println("반액 장학금");
                break;
            default :                               // 모든 케이스를 만족하지 않을때
                System.out.println("박수 쳐줌");
        }

        System.out.println("================================ 문제");

        int grade = 1;
        int price = 7000;
//        1등급은 10000, 등급이 낮아질수록 -1000
        switch (grade) {
            case 1 :
                price += 1000;
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
            default :
                System.out.println("상금 : " + price);
        }

        /*
        * 월을 입력 받고(int)
        * 3, 4, 5 => Spring 출력
        * 6, 7, 8 => Summer 출력
        * 9, 10, 11 => Autumn 출력
        * 12, 1, 2 => Winter 출력
        * */

        Scanner scanner = new Scanner(System.in);

        int _Month = scanner.nextInt();
        String _Season = "Spring";

        switch (_Month) {
            case 6 :
            case 7 :
            case 8 :
                _Season = "Summer";
                break;
            case 9 :
            case 10 :
            case 11 :
                _Season = "Autumn";
                break;
            case 12 :
            case 1 :
            case 2 :
                _Season = "Winter";
                break;
            default:
                System.out.println("계절 : " + _Season);
        }

        /*
        * 계산기
        * 1. 숫자 a를 입력 받음
        * 2. 연산자 기호를 입력 받음 (+, -, *, /) => 이외 기호는 "유효한 기호가 아닙니다." 출력
        * 3. 숫자 b를 입력 받음
        * switch case default문을 이용해서 연산 결과를 출력하시오.
        * */

        System.out.println("첫번째 숫자 입력 >>>>>");
        int _Num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("연산자 입력 >>>>>");
        String _Oper = scanner.nextLine();
        System.out.println("두번째 숫자 입력 >>>>>");
        int _Num2 = scanner.nextInt();

        switch (_Oper) {
            case "+" :
                System.out.println("결과 >>>>> " + (_Num1 + _Num2));
                break;
            case "-" :
                System.out.println("결과 >>>>> " + (_Num1 - _Num2));
                break;
            case "*" :
                System.out.println("결과 >>>>> " + (_Num1 * _Num2));
                break;
            case "/" :
                System.out.println("결과 >>>>> " + (_Num1 / _Num2));
                break;
            default :
                System.out.println("유효한 기호가 아닙니다.");
        }





    }
}
