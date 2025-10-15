package _02_DataTypes;

/*
* 표기법
* 카멜 표기법 (단봉낙타 표기법) : 변수명, 메소드명
* ex) firstName - 첫단어 첫번째 캐릭터만 소문자
* 파스칼 표기법 (쌍봉낙타 표기법) : 클래스명, 파일명
* ex) SecondName - 모든 단어 첫번째 캐릭터가 대문자
* */

public class DataTypes {
    public static void main(String[] args) {
//        정수 int 형태 - 4 bytes (-2147483648 ~ 2147483647)
//        정수 long 형태 - 8 bytes (-9223372036854775808 ~ 9223372036854775807)

//        문자형 char 형태 - 2 bytes

//        실수형 float 형태 - 4 bytes
//        실수형 double 형태 - 8 bytes

//        논리형 boolean 형태 - 1 byte (true or false) - 조건문에서 많이 쓴다

        System.out.println("안녕하세요"); // 여러글자 = 문자열,쌍따옴표로 감싸야 한다
        System.out.println(123); // 따옴표 없으면 숫자로 인식
        System.out.println("123"); // 따옴표 있으면 문자로 인식
        System.out.println(3.14); // 실수

        /*
        * 변수 - 값을 담는 바구니
        * 데이터는 바뀔수도 있고 하나하나 수정하기엔 비효율적이다.
        * 재사용성 향상, 유지보수 향상
        *
        * 구조 : 자료형 변수명 = 데이터;
        * 자료형 : 데이터의 형태
        * */

        System.out.println("이름"); // 개명시 일일히 찾아서 변경
        System.out.println("이름");
        System.out.println("이름");
        System.out.println("이름");
        System.out.println("이름");
        System.out.println("이름2"); // 개명시 일일히 찾아서 변경
        System.out.println("이름2");
        System.out.println("이름2");
        System.out.println("이름2");
        System.out.println("이름2");
        String name = "이름"; // 개명시 변경 간편
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        name = "이름2"; // 개명시 변경 간편
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);

        // 정수  int, long
        int num1 = 10; // 10이라는 값을 가진 int 자료형의 변수
        System.out.println(num1);
        int age = 45;
        System.out.println("나이는 " + age + "세 입니다.");

        long num2 = 1000000000000000000L;
        System.out.println(num2);
        num2 = 1_000_000_000_000_000_011L;
        System.out.println(num2);

        // 실수 float, double
        double d = 3.1415926234;
        System.out.println(d);
        float f = 3.1415926234F;
        System.out.println(f);

        // 문자, 문자열 char, String
        char lastName ='성';
        String firstName = "이름";
        System.out.println(lastName);
        System.out.println(firstName);
        char char1 ='가';
        char char2 ='나';
        char char3 ='다';
        System.out.println(char1 + char2 + char3);
        System.out.println("" + char1 + char2 + char3);

        System.out.println(lastName + firstName);

//        코딩 테스트 - 백준, 프로그래머스

        String nameb = "성이름";
        String hello = "안녕하세요";
        System.out.println(nameb + hello);

//        논리형 boolean
        boolean isEmpty = true;
        System.out.println(isEmpty);
        isEmpty = false;
        System.out.println(isEmpty);

//        이름변수 나이변수 주소변수를 선언
//        제 이름은 *** 이고, 나이는 **살이며, ***에서 살고 있습니다.
        String _Name = "홍해준";
        int _Age = 45;
        String _Address = "부산광역시 사하구";
        System.out.println("제 이름은 " + _Name + "이고, 나이는 " + _Age + "살이며, " + _Address + "에서 살고 있습니다.");
    }
}
