package _14_Method;

public class ParameterAndReturn {
//    public static void power (int number) {             // number = 파라미터
//        System.out.println(number + "의 제곱은 " + number*number + "입니다.");
//    }

    public static int power (int number) {
        return number*number;
    }

    public static int powerByExp (int number, int exponent) {
        int ne = number;
        for (int i = 0; i < exponent; i++) {
            ne *= number;
        }
        return ne;
    }

    public static void main(String[] args) {
        System.out.println((power(7)));
        System.out.println(powerByExp(4,3));

    }
}
