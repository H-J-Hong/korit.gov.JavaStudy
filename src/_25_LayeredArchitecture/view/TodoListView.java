package _25_LayeredArchitecture.view;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.service.TodoService;
import _25_LayeredArchitecture.service.UserService;

import java.util.Scanner;

public class TodoListView {
    private Scanner scanner;
//    유저 객체가 존재하면 로그인 상태임을 판단할 수 있다!
    private User principal;
    private UserService userService;
    private TodoService todoService;

    public TodoListView(UserService userService,TodoService todoService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
        this.todoService = todoService;
    }

    public void homeView() {
        while(true) {
            System.out.println("[Todo List]");
            System.out.println("1. TodoList 관리");
            if (principal == null) {                    // principal 객체의 내용이 없다면 로그인 상태가 아님!
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {                                    // principal 객체의 내용이 없지 않다면 로그인 상태!
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(">>>");
            String cmd = scanner.nextLine();        // 생성자에서 Scanner 선언

//            cmd == null일때 널 익셉션 에러 발생 가능성 때문에 "q".equals(cmd) 사용
//            이후 조건을 조합하여 판단해야 되는 경우가 생기므로 switch - case는 사용하지 않음.
            if ("q".equals(cmd)) {
                break;
            }
            else if ("1".equals(cmd)) {
//                TodoList 관리
                if (principal == null) {
                    System.out.println("로그인 후 사용 가능합니다.");
                    continue;
                }
                todoListMenuView();
            } else if ("2".equals(cmd) && principal == null) {
                signupView();
            } else if ("3".equals(cmd) && principal == null) {
                signinView();
            } else if ("2".equals(cmd) && principal != null) {
                principal = null;
                System.out.println("===== 로그아웃 완료 =====");
            } else {
                System.out.println("메뉴를 다시 선택해주세요.");
//                continue;
            }
        }
    }
//    회원 가입 뷰
    public void signupView() {
        System.out.println("회원 가입");

        String username = null;
        while(true) {                   // username이 중복인지 확인 - 무한루프
            System.out.print("username >> ");
            username = scanner.nextLine();
            if (!userService.isDuplicatedUsername(username)) {
                // 중복이 발견되지 않았을때 루프를 빠져나감
                System.out.println("사용 가능한 username 입니다.");
                break;
            }
            System.out.println("이미 존재하는 username 입니다.");
        }

        System.out.print("password >> ");
        String password = scanner.nextLine();

        System.out.print("nickname >> ");
        String name = scanner.nextLine();

        SignupReqDto signupReqDto = new SignupReqDto(username, password, name);
//        signupReqDto를 UserService의 회원 가입 로직으로 전달
        userService.signup(signupReqDto);
        System.out.println("===== 회원 가입 완료 =====");
//        조회 할 수 있는 로직
        userService.printAllUserList();
    }

    public void signinView() {
        System.out.println("[ 로그인 ]");
        System.out.print("username >>");
        String username = scanner.nextLine();
        System.out.print("password >>");
        String password = scanner.nextLine();
        SigninReqDto signinReqDto = new SigninReqDto(username, password);
        User foundUser = userService.signin(signinReqDto);
        if (foundUser == null) {
            System.out.println("사용자 정보를 다시 확인해 주세요");
            return;
        }
        principal = foundUser;
        System.out.println("===== 로그인 성공 =====");

    }

    public void todoListMenuView() {
        while (true) {
            System.out.println("[ TodoList Menu ]");
            System.out.println("1. Todo 등록");
            System.out.println("2. Todo 조회");
            System.out.println("b. 뒤로가기");
            System.out.print(">>> ");
            String cmd = scanner.nextLine();

            if ("b".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)){
                todoRegisterView();
            } else if ("2".equals(cmd)){
                todoShowView();
            }
        }
    }

    public void todoRegisterView() {
        System.out.println("[ Todo 등록 ]");
        System.out.print("contents>>> ");
        String contents = scanner.nextLine();
        TodoRegisterReqDto todoRegisterReqDto = new TodoRegisterReqDto(contents, principal);
        todoService.todoRegister(todoRegisterReqDto);
        System.out.println("===== Todo 등록 완료 =====");
        todoService.printAllTodoList();

    }

    public void todoShowView() {
        System.out.println("[ Todo 조회 ]");
        todoService.todoShow(principal);
        System.out.println("==== Todo 조회 완료 =====");
    }
}
