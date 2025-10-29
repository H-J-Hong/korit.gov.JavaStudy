package _24_Builder.StaticMember;

/*
* Builder 패턴을 사용하였을때의 장점
* 1. 필요한 필드 데이터만 설정 가능
* 2. 유연성 확보
* 3. 가독성 향상
* 4. 변경 가능성을 최소화
* */

public class StaticMemberMain {
    public static void main(String[] args) {
        StaticMember staticMember = new StaticMember.Builder()     // Builder 클래스의 객체 의 생성자
                .name("이동윤")                                     // 필드를 채워 감
                .age(27)
                .email("someone@somewhere.com")
                .build();                                          // 필드를 다 채운 StaticMember클래스의 객체를 생성자에 반환

    }
}
