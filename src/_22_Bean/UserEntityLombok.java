package _22_Bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/*
* Lombok 사용 -> 코드 다이어트
* 스프링부트 활용시 필수 라이브러리!!
* */

@Getter
@Setter
@ToString
//@AllArgsConstructor
public class UserEntityLombok {
    private int userId;
    private String username;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
}
