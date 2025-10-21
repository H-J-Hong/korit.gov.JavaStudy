package _15_Overloading;

public class Overloading {
    public static int getPower(int a) {
        return a*a;
    }

    public static int getPower(double a) {
        return (int)(a*a);
    }

    public static void printInfo(String name){
        System.out.println("이름 : " + name);
    }

    public static void printInfo(String name, int age){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

    public static void printInfo(String name, int age, String email){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("이메일 : " + email);
    }

    public static void main(String[] args) {
//        메소드 오버로딩 (오버라이딩과 다름)
//        같은 이름의 메소드를 여러개 선언하는데 다음과 같은 제약사항이 있다.
//        1. 전달값(파라미터)의 값이 달라야 한다.
//        2. 전달값(파라미터)의 수량이 달라야 한다.
//        3. 반환형은 같아도 무방하다.
        String str = "abc";
        str.indexOf(str);
//        String str.indexOf()의 예 -> int 하나, int 두개, string 하나, string하나+int하나 - 네가지 방식이 오버로딩!!
//        굳이 사람이 고르지 않더라도 자료형을 Java에서 판단하여 올바른 메소드를 호출함.
        System.out.println(getPower(5));
        System.out.println(getPower(5.78568));

//        printInfo()
//        문자열 이름만 전달해서 이름 출력
//        문자열 이름과 정수 나이 전달해서 이름 나이 출력
//        문자열 이름과 정수 나이, 문자열 이메일 전달하여 이름 나이 이메일 출력
        printInfo("홍해준");
        printInfo("홍해준",45);
        printInfo("홍해준",45,"ghdgowns@gmail.com");

    }
}
