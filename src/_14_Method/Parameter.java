package _14_Method;

public class Parameter {
    public static void power (int number) {             // number = 파라미터
        System.out.println(number + "의 제곱은 " + number*number + "입니다.");
    }

    public static void powerByExp (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
    }

    public static void getAverage(int n1, int n2, int n3) {
        System.out.println(n1 + ", " + n2 + ", " + n3 + "의 평균은 " + (n1+n2+n3)/3.0 + "입니다.");
    }

    public static void evalOddEven(int number) {
        System.out.println(number + " 은(는) " + ((number%2 == 0) ? "짝수 입니다." : "홀수 입니다."));
    }

    public static void main(String[] args) {
//        파라미터 -> 메소드에 전달될 값
        power(3);                               // 2를 전달하여 메소드에 정의된 결과를 얻음
        powerByExp(2,4);

//        3개의 정수를 전달하여 평균을 출력하는 메소드를 만드세요.
        getAverage(75,80,90);

//        정수를 전달하여 짝수인지 홀수인지 판별후 출력하는 메소드를 만드세요.
//        단 삼항 연산자를 활용할 것
        evalOddEven(7);
    }
}
