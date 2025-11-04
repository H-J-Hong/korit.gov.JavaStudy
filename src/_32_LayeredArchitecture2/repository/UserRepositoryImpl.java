package _32_LayeredArchitecture2.repository;

import _32_LayeredArchitecture2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private static UserRepositoryImpl instance;
    private List<User> users;
    private int autoIncrementId;

    private UserRepositoryImpl() {
        this.users = new ArrayList<>();
        this.autoIncrementId = 1;
    }

    public static UserRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new UserRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void insert(User user) {
        user.setUserId(this.autoIncrementId++);             // 후위 연산자이므로 맨 처음에는 1 들어감.
        this.users.add(user);
        System.out.println(users);                          // 디버깅 코드
    }

    @Override
    public User findByUsername(String username) {
        for(User i : this.users) {
            if (username.equals(i.getUsername())) return i;
        }
        return null;
    }
}
