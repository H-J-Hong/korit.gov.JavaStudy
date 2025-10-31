package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.TodoList;
import _25_LayeredArchitecture.repository.UserList;

import java.time.LocalDateTime;

public class TodoService {
    private TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }


    public void todoRegister(TodoRegisterReqDto todoRegisterReqDto) {
//        1. 엔티티
//        2. todoId 생성
//        (3. createDt 생성) -> dto에서 바로 생성 가능함 (주입된 값이 아니라 서버에서 구하는 값이므로)
//        3. todoList 추가
        Todo todo = todoRegisterReqDto.toEntity();
//        todo.setCreateDt(LocalDateTime.now());
        todo.setTodoId(todoList.generateTodoId());
        todoList.add(todo);
    }

    public void todoShow(User user) {
        System.out.println("[[ " + user.getUsername() + " 의 TodoList 조회 ]]");
        for (Todo todo : todoList.getUserTodoList(user)) {
            System.out.println(todo);
        }
    }

    //    등록된 TodoList 전체 출력
    public void printAllTodoList() {
        System.out.println("[[ TodoList 전체 조회 ]]");
        for(Todo todo : todoList.getAllTodoList()) {
            System.out.println(todo);
        }
    }
}
