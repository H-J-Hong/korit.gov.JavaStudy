package _23_Static.Person;

public class Person {
    public static int population = 0;
    final String COUNTRY1 = "korea";
    static final String COUNTRY2 = "US";

    public Person() {
        population++;
    }

    public static void showPopulation() {
        System.out.println("인구 수 : " + population);
//        1. showPopulation()은 객체 선언이 필요없이 호출 가능한 메소드.
//        2. population 변수가 static으로 선언되지 않았다면 객체 선언이 필요함.
//        -> 객체 선언이 필요한 변수는 객체가 선언이 되어야만 존재하므로 객체 선언이 필요 없는 메소드에서 접근 불가능!!
    }
}
