package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.User;

import java.util.Arrays;

public class UserList {
    private User[] users;

    public UserList() {
        this.users = new User[0];
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public int generateUserId() {
        /*
        * 1. users 배열에 아무것도 없으면 1 반환
        * 2. 있으면 마지막 user 객체의 userId에 + 1한 결과값을 반환
        * 3. 가능하면 삼항연산자
        * */
        return (users == null || users.length == 0) ? 1 : (users[users.length-1].getUserId() + 1);
    }

    public void add(User user) {
        /*
        * 새로 넣을 배열의 길이 => 원래 있던 배열의 길이 + 1
        * 새로 넣을 배열에 원래 있던 배열 내용을 먼저 추가
        * 새로 넣을 배열의 맨 마지막 공간에 user 삽입
        * users에 있던 배열에서 새로운 배열로 바꾸기
        * */
        User[] tmp = new User[this.users.length + 1];
        for (int i = 0; i < this.users.length; i++) {
            tmp[i] = this.users[i];
        }
        tmp[tmp.length-1] = user;
        this.users = tmp;
    }

    public User[] getAllUser() {
        return this.users;
    }
}


