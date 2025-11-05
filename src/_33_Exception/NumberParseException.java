package _33_Exception;

/*
* 1. 사용자로부터 문자열 형태의 입력을 받습니다.
* 2. 입력된 문자열을 Integer.parseInt()를 사용하여 정수로 반환합니다.
* 3. 변환된 숫자를 출력합니다.
* 4. 만약 변환하는 과정에서 입력값이 숫자가 아니라면 예외 발생
* => 예외 처리후 "숫자가 아닌 값을 입력하셨습니다." 출력
* */

import _10_For.For;

import java.util.Scanner;

public class NumberParseException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. >>>>> ");
        String s = sc.nextLine();

//        Exception in thread "main" java.lang.NumberFormatException: For input string: "ㅁㄴㅇㄹ"
//        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//        at java.base/java.lang.Integer.parseInt(Integer.java:668)
//        at java.base/java.lang.Integer.parseInt(Integer.java:786)
//        at _33_Exception.NumberParseException.main(NumberParseException.java:19)

//        Integer i = Integer.parseInt(s);
//        System.out.println(i);

        try {
            Integer i = Integer.parseInt(s);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("숫자가 아닌 값을 입력 하셨습니다.");
            throw new NumberFormatException(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
