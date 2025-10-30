package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.dto.TodoRegisterReqDto;
import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.UserList;

import java.time.LocalDateTime;
import java.util.Arrays;

public class UserService {
    private UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }

    public User signin(SigninReqDto signinReqDto) {
        User foundUser = userList.findByUsername(signinReqDto.getUsername());
        if (foundUser == null) {
//            유저 정보 없음
            return null;
        }
        if (!foundUser.getPassword().equals(signinReqDto.getPassword())) {
//            비밀번호가 일치하지 않음
            return null;
        }
        return foundUser;
    }

//    중복된 유저가 있는지 확인하는 로직
    public boolean isDuplicatedUsername(String username) {
//        UserList에 대하여 중복 확인
        return userList.findByUsername(username) != null;
    }

//    회원 가입 로직
    public void signup(SignupReqDto signupReqDto) {
//        1. signupReqDto -> user(entity)로 변환하는 과정 필요
        User user = signupReqDto.toEntity();
//        2. userId를 생성 : userList의 갯수를 세어 반환 받은 다음 +1 하여 userId 생성
        user.setUserId(userList.generateUserId());
//        3. userList 내의 배열에 추가
        userList.add(user);
    }

//    회원 정보 전체 출력
    public void printAllUserList() {
        System.out.println("[[ 회원 정보 전체 조회 ]]");
        for (User user : userList.getAllUser()) {
            System.out.println(user);
        }
    }
}
