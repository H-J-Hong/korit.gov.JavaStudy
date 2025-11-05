package _33_Exception;

import java.util.Scanner;

/*
* AgeRestrictionReception => 나이 제한에 대한 예외 클래스
* signup (String username, int age)
* => 가입조건 만 14세 이상
* 이 조건에 만족하지 않으면 AgeRestrictionException 발생
* 해당 예외는 호출한 곳에서 처리
* 만약 예외가 발생하지 않는다면 "username님, 가입을 환영 합니다." 출력
*
* try-catch-finally는 main에서 처리
* 예외 발생시 "회원가입 실패 : <이유>" 출력
* 예외 유무 상관없이 "회원 가입 처리 종료" 출력
*
* */
class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class SignupException {
    static void signup (String username, int age) throws AgeRestrictionException {
        if (age < 14) {
            throw new AgeRestrictionException("만 14세 미만은 가입할 수 없습니다.");
        }
        System.out.println(username + " 님, 가입을 환영 합니다.");
//        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력 하세요 >>> ");
        String username = sc.nextLine();
        System.out.print("나이를 입력 하세요 >>> ");
        int age = sc.nextInt();
        sc.nextLine();

        try {
            signup(username,age);
        } catch (Exception e) {
            System.out.print("회원 가입에 실패하였습니다. : ");
            if (e.toString().contains("AgeRestriction")) {
                System.out.println(e.getMessage());
            }
        } finally {
            System.out.println("회원 가입 처리 종료");
        }

    }
}
