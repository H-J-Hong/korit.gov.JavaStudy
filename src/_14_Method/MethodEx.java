package _14_Method;

public class MethodEx {
    public static int getMax(int a, int b, int c) {
        int max = a;
        if (max>b) max = b;
        else if (max>c) max = c;

        return max;
    }

    public static boolean isEven(int a) {
//        return (a % 2 == 0) ? true : false;
        return a % 2 == 0;
    }

    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }

    public static boolean contains(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        최대값 구하기
//        3개의 정수를 전달받아 그중 최대의 값을 반환
        System.out.println(getMax(3,7,5));

//        홀짝 판단
//        1개의 정수를 전달받아 boolean형태로 짝수일때 true, 홀수는 false를 반환
        System.out.println(isEven(5));

//        절대값 구하기
//        삼항연산자 활용
        System.out.println(abs(-5));

//        포함여부 (선형 탐색)
//        contains([1, 3, 5], 3) => 있으면 true, 없으면 false 반환
        int[] arr = {1, 3, 5};
        System.out.println(contains(arr, 3));

        System.out.println((int)'1');
    }
}
