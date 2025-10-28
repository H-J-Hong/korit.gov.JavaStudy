package _22_Bean;

// back-end 서버 만들때 중요한 개념

// Entity : DB에 일대일 매칭이 되는 Model
// Bean : Entity가 되기 위한 규칙
// DTO(Data Transform Object) -> request(유저가 입력한 값) / response (DB에 매칭시키기 위해 Entity형태로 만들어진 값)

// Web -> Controller layer에서 분기 -> Service layer에서 분기 -> Repository layer -> Mapper layer -> Mapper.xml(SQL로 구현) -> DB에 등록
// 예) 웹에서 회원가입 요청 -> 컨트롤러 레이어에서 Auth/signup으로 분기
//     -> 서비스 레이어 에서 signup으로 분기 (중복 아이디, 규약에 어긋나는 비밀번호등 유효성 검사)
//

/*
* Bean
* 필드 속성들을 property라고 부른다.
* 해당 property들은 private 접근자로 캡슐화 되어 있어야 한다.
* 캡술화된 property들은 getter/setter로만 접근 가능해야 한다.
* getter/setter는 public 접근자이어야 한다.
* 목적 : 데이터를 표현
* */

import java.time.LocalDateTime;

public class UserEntity {
    private int userId;
    private String username;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
    private int statusCode;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity(userId = " + userId + " , username = " + username + " , age = " + age + " , email = " + email + ")";
    }
}

// Entity
// DB의 테이블과 1:1 매핑이 되는 클래스
// 자바 객체 <-> DB 테이블간 데이터를 매핑 하기 위해 사용

// Entity는 왜 Bean인가?
// Bean은 일종의 가이드라인, 명세, 규칙

// Entity가 Bean이 되기 위해 기본 생성자를 사용함.
