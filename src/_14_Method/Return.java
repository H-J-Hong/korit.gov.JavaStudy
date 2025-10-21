package _14_Method;

public class Return {
    public static void getAverage() {               // return이 없어도 에러가 발생하지 않는다!
    }
    public static String getName() {       // return이 없으면 에러가 발생한다!
        String name = "홍해준";
        return name;
    }

    public static int getAge() {
        int age = 45;
        return age;
    }

    public static void main(String[] args) {
//        return => 메소드의 반환값(함수의 아웃풋)
//        void => "반환값이 없다."
//        void 대신 자료형 => "반환값의 형태가 자료형이다."
        String name = getName();                    // 메소드의 name과 메인함수의 name은 별개로 작동!
        System.out.println(name);

        int myAge = getAge();
        System.out.println(myAge);
    }
}
