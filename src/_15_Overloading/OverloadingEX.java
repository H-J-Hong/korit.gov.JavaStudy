package _15_Overloading;

public class OverloadingEX {
    public static int max(int a, int b) {
        return (a > b)? a : b;
    }

    public static double max(double a, double b) {
        return (a > b)? a : b;
    }

    public static void main(String[] args) {
//        max()
//        int 숫자 두 개중 더 큰 값 리턴
//        double 숫자 두 개중 더 큰 값 리턴
        System.out.println(max(5,7));
        System.out.println(max(5.45687,7.8997));

    }
}
