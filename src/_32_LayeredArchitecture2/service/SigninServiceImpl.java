package _32_LayeredArchitecture2.service;

/*
* 싱글톤으로 만들것
* void signin
* 로그인을 시도한 사용자 이름 확인
* 해당 사용자 이름을 가진 User 객체가 있는지 확인
* 객체가 Null 이면 함수 탈출 (사용자 정보를 다시 확인 하세요)
*
* 비밀번호 일치 확인
* 비밀번호가 일치하지 않으면 함수 탈출 (사용자 정보를 다시 확인 하세요)
*
* 로그인 성공 -> 로그인 성공된 객체 toString으로 출력
*
* boolean isEmpty
* username, password 각각 Null이나 공백이 아닌지 확인.
* */

import _32_LayeredArchitecture2.dto.SigninReqDto;
import _32_LayeredArchitecture2.entity.User;
import _32_LayeredArchitecture2.repository.UserRepository;
import _32_LayeredArchitecture2.repository.UserRepositoryImpl;
import _32_LayeredArchitecture2.util.PasswordEncoder;

public class SigninServiceImpl implements SigninService {
    public static SigninServiceImpl instance;
    private UserRepository userRepository;

    private SigninServiceImpl( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SigninService getInstance() {
        if (instance == null) {
            instance = new SigninServiceImpl(UserRepositoryImpl.getInstance());
        }
        return instance;
    }

    @Override
    public void signin(SigninReqDto signinReqDto) {
        User foundUser = userRepository.findByUsername(signinReqDto.getUsername());
        if (foundUser == null) {
            System.out.println("사용자 정보를 다시 확인 하세요");
            return;
        }
        if (!PasswordEncoder.match(signinReqDto.getPassword(),foundUser.getPassword())) {
            System.out.println(PasswordEncoder.encode(signinReqDto.getPassword()));
            System.out.println(foundUser.getPassword());
            System.out.println("abv1사용자 정보를 다시 확인 하세요");
            return;
        }

        System.out.println("로그인 성공");
        System.out.println(foundUser);
    }

    @Override
    public boolean isEmpty(String str) {
        return (str == null || str.isBlank());
    }
}
