package _33_Exception;

/*
* 오류는 두가지로 나뉨
* Error - 시스템적 오류 (JVM이 감당 못함) => OutOfMemoryError, StackOverflowError
* Exception - 개발자가 처리 가능한 오류 => NullPointerException, IOException
*
* 예외(Exception)
* - 프로그램 실행중 발생할 수 있는 비정상적인 상황을 객체로 표현한 것
*
* */

import java.util.Arrays;

public class Exception01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        int result = a/b;
//        System.out.println(result);

//        Exception in thread "main" java.lang.ArithmeticException: / by zero       => 예외 종류(연산 예외), 내용(0으로 나눔)
//        at _33_Exception.Exception01.main(Exception01.java:17)                    => 예외 발생 위치

//        예외 처리를 해주는 이유
//        Java의 특성상 예외가 하나라도 발생하면 전체 컴파일링을 실패로 간주함.
        /*
        * try-catch-finally 구문 / throws 키워드
        * try {
        *    // 예외가 발생 할 수 있는 코드
        * } catch(ExceptionType e) {
        *    // 예외 발생시 실행할 코드
        * } finally {
        *    // 예외 발생 여부와 상관 없이 계속 실행 되는 코드
        * }
        *
        * */
        System.out.print(a + "  /  " + b + "  =  ");
        try {
            int result = a/b;
            System.out.println(result);
        } catch(ArithmeticException e1) {
            System.out.println();
            System.out.println("0으로 나눌 수 없습니다.   " + e1.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }

        int[] numbers = {1, 2, 3};
        int idx = 5;

        System.out.println(Arrays.toString(numbers) + "     " + idx);
//        System.out.println(numbers[5]);

//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
//        at _33_Exception.Exception01.main(Exception01.java:48)
        try {
            System.out.println(numbers[idx]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("배열에 접근할 수 있는 인덱스 크기를 초과하였습니다. " + e.getMessage());
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
            throw new RuntimeException(e2.getMessage());
//            throw - 이미 정의된 예외 클래스를 이용해서 의도적으로 예외를 던지는 역할
//            반드시 new 키워드를 사용하여 예외 객체를 생성해야 한다.
//            RuntimeException에 객체를 필드로 사용하면 익셉션이 두번 발생(객체 1번 메소드 1번)
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
