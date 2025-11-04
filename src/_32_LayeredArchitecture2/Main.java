package _32_LayeredArchitecture2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("[회원관리 시스템]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.print(">>>>> ");
            String selectedMenu = scanner.nextLine();

            if (selectedMenu.equals("1")) {

            } else if (selectedMenu.equals("2")) {

            } else if (selectedMenu.equals("3")) {


            } else if (selectedMenu.equals("q")) {
                break;

            }
        }

    }
}

