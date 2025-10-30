package _25_LayeredArchitecture;

import _25_LayeredArchitecture.repository.UserList;
import _25_LayeredArchitecture.service.UserService;
import _25_LayeredArchitecture.view.TodoListView;

/*
* LayeredArchitecture 생성 절차
* 1. view - 메뉴 선택
* 2. service - 비즈니스 로직 호출 -> 조합 / 흐름 제어
* 3. entity - 정보를 담을 클래스에 대한 정의
* 4. dto - entity에 접근할 정보를 가진 도구? (ex - signup 단계에서 필요한 정보 => 유저이름 / 패스워드 / 닉네임)
* 5-1. repository(DB) - 유저 정보를 담고 있는 User의 배열 생성
* 5-2. repository(DB) - Todo 정보를 담고 있는 Todo 배열 생성
* 6. repository - 2에서 호출된 명령에 따라 3-1 / 3-2 에서 생성된 배열에 접근할 메소드 생성
*
* 서로 서로 의존적이므로 -> 생성자에 주입을 시켜주는 절차 Main에서 시행
*
* 1) DB (Table) 설계가 우선
* 2) DB에 접근할 entity와 dto 생성
* */


public class TodoListMain {
    public static void main(String[] args) {
        UserList userList = new UserList();
        UserService userService = new UserService(userList);
        TodoListView todoListView = new TodoListView(userService);
        todoListView.homeView();
    }
}
