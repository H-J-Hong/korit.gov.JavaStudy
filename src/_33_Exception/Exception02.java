package _33_Exception;


import java.util.Scanner;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}

public class Exception02 {
    static void login(String id, String password) throws LoginFailedException {
        String correctId = "admin";
        String correctPassword = "asdf1234";

        if (!(correctId.equals(id) || correctPassword.equals(password))) {
            throw new LoginFailedException("아이디나 비밀번호가 올바르지 않습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력 하세요 >>> ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력 하세요 >>> ");
        String password = sc.nextLine();
        try {
            login(id,password);
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }


    }
}
