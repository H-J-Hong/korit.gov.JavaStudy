package _24_Builder.NonStaticMember;

public class NonStaticMemberMain {
    public static void main(String[] args) {
        NonStaticMember nonStaticMember = NonStaticMember.builder()     // Builder 의 객체만 만들어짐
                .name("이동윤")                                          // 필드를 채워 감
                .age(27)
                .email("someone@somewhere.com")
                .build();                                               // 필드를 다 채운 NonStaticMember클래스의 객체 반환
    }
}
