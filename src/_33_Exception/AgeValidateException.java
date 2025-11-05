package _33_Exception;

/*
* 1.
*
* */

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidateException {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        나이를 입력 받고 검증 함수를 통해 확인
//        나이 입력받을때 nextInt()로 입력받고 숫자가 아닌 입력 발생시 => "숫자가 아닙니다. 정수를 입력해주세요." 출력
//        검증 함수에서 예외 발생시 "예외 발생 : *** 에러 메세지 ***" 출력

        System.out.print("나이를 입력 하세요 : ");
//        int age = sc.nextInt();

//        Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//        at java.base/java.util.Scanner.next(Scanner.java:1594)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//        at _33_Exception.AgeValidateException.main(AgeValidateException.java:17)
//        validateAge(age);
//        System.out.println("나이 : " + age);

        try {
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("정상적인 나이가 입력되었습니다. : " + age);
        } catch (InputMismatchException e) {
            System.out.println("예외 발생 : " + "숫자가 아닙니다. 정수를 입력해주세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }

    public static void validateAge(int age) {
        if (age <= 0 || age >= 150) {
            throw new IllegalArgumentException("유효하지 않은 나이 입니다. (입력값 : " + age + ")");
        }
    }
}
