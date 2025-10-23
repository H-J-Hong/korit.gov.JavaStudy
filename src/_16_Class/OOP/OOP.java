package _16_Class.OOP;

import _16_Class.Person.Person;

public class OOP {
    public static void main(String[] args) {
//        OOP = 객체 지향 프로그래밍 (Object Oriented Programming)
//        !!!!! Java에서 가장 중요한 개념 !!!!!
//        - 현실 세계의 개념을 코드로 표현한 것.
//        - 사람, 동물, 자동차 이런 것들을 하나의 객체로 본다.
//        - 상태(속성) / 동작(기능)을 중심으로 프로그래밍 한다.
//        자동차의 예)
//        전장, 전폭, 무게 등등 - 상태(속성) / 전진, 후진, 좌회전, 우회전, 깜빡이, 와이퍼 등등 - 동작(기능)

//        OOP의 4가지 원칙
//        1. 추상화 - 복잡한 내부 동작은 감추고 꼭 필요한 기능만 보여주는 것.
//        - 자동차를 앞으로 가게 하기 위해 엔진 행정, 크랭크 동작, 밸브 제어 등을 알 필요가 있는가?
//        2. 캡슐화 - 데이터(변수)를 보호하고 접근을 제한하여 안정성을 높이는 것.(정보 은닉)
//        3. 상속
//        4. 다형성

//        실습1)
//        Student라는 패키지 안에 Student와 StudentMain 클래스 만들고
//        Student 클래스의 속성 : 이름, 나이, 이메일, 주소
//        메소드 -> showInfo()로 정보 출력
//        StudentMain에서 객체 생성후 정보대입, showInfo()메소드를 통해 정보 출력

//        OOP 클래스와 PersonMain 결과 비교!!
        Person person = new Person();          // public은 어디서나 접근 가능
//        Person1 person1 = new Person1();        // private는 같은 패키지 같은 클래스 내에서만 접근 가능
//        Person2 person2 = new Person2();        // defalut는 같은 패키지 내에서만 접근 가능

    }
}
