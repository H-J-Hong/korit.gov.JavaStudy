package _25_LayeredArchitecture.view;

import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.service.UserService;

import java.util.Scanner;

public class TodoListView {
    private Scanner scanner;
    private User principal;
    private UserService userService;

    public TodoListView(UserService userService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
    }

    public void homeView() {
        while(true) {
            System.out.println("[Todo List]");
            System.out.println("1. TodoList");
            if (principal == null) {
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(">>>");
            String cmd = scanner.nextLine();

//            cmd == null일때 널 익셉션 에러 발생 가능성 때문에 "q".equals(cmd) 사용
            if ("q".equals(cmd)) break;
            else if ("1".equals(cmd)) {
//                TodoList 관리
            } else if ("2".equals(cmd) && principal == null) {
//                회원 가입
            } else if ("3".equals(cmd) && principal == null) {
//                로그 인
            } else if ("2".equals(cmd) && principal != null) {
//                로그 아웃
            } else {
                System.out.println("잘못 입력 하셨습니다.");
//                continue;
            }
        }
    }
//    회원 가입 뷰
    void signupView() {
        System.out.println("회원 가입");
        String username = null;
        while(true) {
            System.out.print("username : ");
            username = scanner.nextLine();
//            username이 중복인지 확인 - 무한루프
        }
    }
}
