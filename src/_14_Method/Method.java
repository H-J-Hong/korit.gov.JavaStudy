package _14_Method;

public class Method {
    public static void sayHello() {                 // sayHello() -> 메소드의 이름
        System.out.println("Hello World!");         // 메소드 선언!!
    }
    public static void main(String[] args) {
//        메소드 (함수)
        System.out.println("메소드 호출 전");
        sayHello();                                 // 메소드 호출!!
        System.out.println("메소드 호출 후");

        String str = "abc";
        str.equals("abc");
    }
}
