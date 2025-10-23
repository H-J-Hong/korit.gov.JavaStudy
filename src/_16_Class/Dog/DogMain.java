package _16_Class.Dog;

public class DogMain {
//    Dog Class를 실체화
    public static void main(String[] args) {
//        객체를 생성하는 방법
        Dog dog1 = new Dog();

//        생성된 객체의 속성값 대입 또는 변경
        dog1.name = "방울이";
        dog1.age = 3;
        dog1.dogType = "시고르자브종";

        dog1.name ="해피";                        // dog1 클래스의 name 속성 변경

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.dogType);

//        생성된 객체의 메소드를 호출하는 방법
        String str = "abc";                     // str이라는 String 클래스 생성
        System.out.println(str.length());       // str 클래스의 length()라는 메소드 호출

        dog1.callName();
        dog1.showInfo();
    }

}
