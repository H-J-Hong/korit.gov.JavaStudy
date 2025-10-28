package _22_Bean;

/*
* Lombok -> 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
* 일일히 getter/setter/toString/생성자/빌더 생성하지 않아도 됨 - 코드 다이어트
*
* 자바
* .java 소스코드 => 컴파일 하면 .class 파일 형식으로 변환
* .class파일은 bytecode로 이루어짐 => JVM에 전달 => 실행 ======> "빌드" 작업
*
* 빌드를 도와 주는 도구의 종류 : Maven, Gradle
* 빌드를 전체적으로 효율적이고 자동화 해주기 위한 외부 빌더 시스템
* */

public class Main {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("이동윤");
        userEntity.setAge(27);
        userEntity.setEmail("dongyoon7212@naver.com");
        System.out.println(userEntity);

        UserEntityLombok u2 = new UserEntityLombok();
        u2.setUserId(2);
        u2.setUsername("이동윤");
        u2.setAge(27);
        u2.setEmail("dongyoon7212@naver.com");
        System.out.println(u2);
    }
}
