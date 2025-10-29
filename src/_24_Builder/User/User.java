package _24_Builder.User;

/*
* User 클래스
* 필드
* int userId;
* String username;
* String password;
* String email;
* 빌더 패턴에 맞춰 객체 생성 되도록
* 이메일에 @가 없다면 "이메일 형식이 아닙니다." 출력후 초기값 null 유지
* 최종적으로 객체가 생성 될 때 username과 password필드 둘 중 하나가 비어 있으면
* "username 필드 또는 password 필드가 비어있습니다." 출력후 초기값 null 유지
* toString() 메서드를 오버라이드 하여 객체의 필드가 모두 출력 되도록 커스텀
*
* */

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User {
    private int userId;
    private String username;
    private String password;
    private String email;

//    private User(Builder builder) {
//        this.userId = builder.userId;
//        if (builder.username == null || builder.username.isBlank()) System.out.println("username 또는 password 필드가 비어 있습니다.");
//        else {
//            this.username = builder.username;
//        }
//        if (builder.password == null || builder.password.isBlank()) System.out.println("username 또는 password 필드가 비어 있습니다.");
//        else {
//            this.password = builder.password;
//        }
//        if (builder.email == null || builder.email.indexOf("@") < 0) System.out.println("올바른 이메일 형식이 아닙니다.");
//        else this.email = builder.email;
//    }
//
//    public static class Builder {
//        private int userId;
//        private String username;
//        private String password;
//        private String email;
//
//        public Builder userId(int userId) {
//            this.userId = userId;
//            return this;
//        }
//
//        public Builder username(String username) {
//            this.username = username;
//            return this;
//        }
//
//        public Builder password(String password) {
//            this.password = password;
//            return this;
//        }
//
//        public Builder email(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public User build() {
//            return new User(this);
//        }
//
//    }
}
