package _17_Inheritance;

import _17_Inheritance.Message.Message;

public class Main {
    public static void main(String[] args) {
//        상속 - 기존 클래스(부모 클래스)의 속성(필드)과 기능(메소드)를 새로운 클래스(자식 클래스)가 물려 받는것
//        상속을 사용하는 이유
//        1. 코드의 재사용성, 계층구조 설계를 가능하게 해주는 핵심 개념.
//        2. 유지 보수 공통 기능이 한 곳(부모 클래스)에 있으므로 부모 클래스만 수정해도 자식 클래스에 모두 반영.
//        3. 기존 클래스를 수정하지 않고도 새로운 기능을 자식 클래스에 추가할 수 있음.
//        객체지향의 5대 원칙 - S.O.L.I.D.중 Open Closed Principle - 확장에는 열려있어야 하지만 변경(수정개념)에는 닫혀 있어야 한다.

        /*
        * 자식 클래스는 부모의 코드를 그대로 사용할 수 있다.
        * 자식 클래스는 필요한 기능을 추가하거나, 변경(overriding/덮어쓰기 개념) 가능
        * */
        Animal animal1 = new Animal("호랑이" , 5);
        animal1.move();
        Tiger tiger1 = new Tiger("호랭이", 5, true);
        tiger1.move();
        tiger1.hunt();
        Human human1 = new Human();
        human1.setAnimalAge(50);
        human1.setAnimalName("사람이름");
        human1.setLanguage("한국어");
        human1.getAnimalAge();
        human1.getAnimalName();
        System.out.println(human1.getLanguage());
        human1.move();
        human1.read("삼국지");

        System.out.println();
        Message msg = new Message("재난 알림 문자 입니다.");
        msg.print();


    }
}
