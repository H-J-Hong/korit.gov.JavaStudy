package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;

public class TodoList {
    private Todo[] todos;

    public TodoList() {
        this.todos = new Todo[0];
    }

    public int generateTodoId() {
        return (todos == null || todos.length == 0) ? 1 : (todos[todos.length-1].getTodoId() + 1);
    }

    public void add(Todo todo) {
        /*
         * 새로 넣을 배열의 길이 => 원래 있던 배열의 길이 + 1
         * 새로 넣을 배열에 원래 있던 배열 내용을 먼저 추가
         * 새로 넣을 배열의 맨 마지막 공간에 투두 삽입
         * 원래 있던 투두 배열에서 새로운 배열로 바꾸기
         * */
        Todo[] tmp = new Todo[this.todos.length+1];
        for (int i = 0; i < this.todos.length; i++) {
            tmp[i] = this.todos[i];
        }
        tmp[tmp.length-1] = todo;
        this.todos = tmp;
    }

//    스프링부트 사용시 userId 기준으로 하는것이 좋음 (class 대신 int로)
    public Todo[] getUserTodoList(User user) {
        int userTodoNum = 0;
        for (int i = 0; i < todos.length; i++) {
            if (todos[i].getUser() == user) userTodoNum++;
        }
        Todo[] userTodo = new Todo[userTodoNum];
        int j = 0;
        for (int i = 0; i < todos.length; i++) {
            if (todos[i].getUser() == user) {
                userTodo[j] = todos[i];
                j++;
            }
        }
        return userTodo;
    }

    public Todo[] getAllTodoList() {
        return this.todos;
    }
}
