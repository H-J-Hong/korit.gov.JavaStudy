package _24_Builder.NonStaticMember;

public class NonStaticMember {
    private String name;
    private int age;
    private String email;

//    생성자가 private => 외부에서 객체 생성 불가
    private NonStaticMember() {
    }

//    인스턴스 클래스(클래스 내부의 클래스)
    public class Builder {
        private final NonStaticMember target;
        private Builder(NonStaticMember target) {
            this.target = target;
        }

        public Builder name(String name) {
            target.name = name;
            return this;
        }
        public Builder age(int age) {
            target.age = age;
            return this;
        }
        public Builder email(String email) {
            target.email = email;
            return this;
        }
//        여기 까진  target의 필드를 모두 받아서 채우는 작업
        public NonStaticMember build() {
            return target;
        }
//        위에서 필드가 다 채워진 NonStaticMember 클래스의 target 반환
    }

    public static NonStaticMember/*명시화 개념, Builder만 써도 선언 가능*/.Builder builder () {
//        같은 객체 내부이므로 private인 생성자 호출 가능
        NonStaticMember nonStaticMember = new NonStaticMember();
//        Builder 메소드의 필드에 NonStaticMember 클래스인 빈 객체 nonStaticMember를 주입
        return nonStaticMember.new Builder(nonStaticMember);
    }
}
