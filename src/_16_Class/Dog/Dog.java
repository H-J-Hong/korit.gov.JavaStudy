package _16_Class.Dog;

// 클래스의 정의
public class Dog {
//    속성 => 클래스의 필드
    String name;
    int age;
    String dogType;

//    기능 => 클래스의 메소드
    public void callName() {
        System.out.println("왈왈");
    }

    public void showInfo() {
        System.out.println("[정보출력]");
        System.out.println("이름은 " + name + ", 나이는 " + age + "살");
    }
}
