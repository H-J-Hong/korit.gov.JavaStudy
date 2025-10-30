package _25_LayeredArchitecture.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
* Auth - 소셜 연동 로그인 - 사용시 계정 연동에 대한 고려 필요
* */
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SigninReqDto {
    private String username;
    private String password;
}
