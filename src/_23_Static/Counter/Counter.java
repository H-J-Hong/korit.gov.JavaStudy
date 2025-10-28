package _23_Static.Counter;

/*
* static
* 클래스 차원의 변수나 메소드를 만들때 사용하는 keyword
* 인스턴스 수준이 아닌 => 인스턴스에 속하지 않는다.
* 1. 인스턴스를 생성하지 않고 접근이 가능함.
* 2. 기본적으로 했던 클래스의 객체를 통한 변수나 메소드와는 다르다.
*
* 클래스 수준의 변수 및 메소드 => 클래스 로드시 메모리에 할당.
* 모든 인스턴스가 동일한 static 변수에 접근 가능
* */

public class Counter {
    public static int count = 0;
    public static void increment() {
        count++;
    }

    public static void main(String[] args) {
        increment();
        increment();
        increment();
        System.out.println(count);
    }
}
