package _24_Builder.StaticMember;

/*
* 정적인 방식 - 최종적인 빌더 구현 형태
* */

/*
 * 1. 원 클래스의 private 필드 생성
 * 2. 원 클래스의 NoArgs 생성자 생성
 * 3. 원 클래스 내에서 Builder 클래스 생성
 * 4. Builder 클래스의 필드로 원 클래스와 동일한 private 필드 생성
 * 5. Builder 클래스 내에서 필드 값을 받아들여서 Builder 클래스로 생성된 객체 자신을 반환하는 각 필드 이름의 메소드 생성
 * 6. Builder 클래스의 생성된 객체 자신으로 원 클래스의 생성자를 호출하는 build() 메소드 생성
 * 7. 원 클래스의 NoArgs 생성자를 Builder 클래스를 필드로 받는 생성자로 변경
 * 8. 7번에서 변경된 원 클래스의 변경된 생성자 내에서 원 클래스의 필더를 Builder 클래스의 필드로 변경해주는 내용 추가
 * */

public class StaticMember {
    private String name;
    private int age;
    private String email;

    private StaticMember(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class Builder {
        private String name;
        private int age;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public StaticMember build() {
            return new StaticMember(this);
        }
    }
}
