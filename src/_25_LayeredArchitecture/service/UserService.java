package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.repository.UserList;

public class UserService {
    private UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }

    public boolean isDuplicatedUsername(String username) {
//        UserList에 대하여 중복 확인
        return userList.findByUsername(username) != null;
    }
}
