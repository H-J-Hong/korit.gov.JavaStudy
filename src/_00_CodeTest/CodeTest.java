package _00_CodeTest;

import _20_Casting.Animals2.Soundable;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
//        int[] arr = new int[] { 0, 1, 1, 1, 0 };
//
//        && !(i%a.get(a.size()-1) == 0 && i>=a.get(a.size()-1))
//        int n = 252;
//        for (int n = 1 ; n <= 100; n++) {
//
//            List<Integer> a = new ArrayList<>();
//            int k = n;
//            a.add(1);
//
//            boolean flag = true;
//            while (flag) {
//                k /= a.get(a.size() - 1);
//                for (int i = 2; i <= k; i++) {
//                    System.out.println(i + "     " + k + "     " + a);
//                    if (k % i == 0 && !a.contains(i)) {
//                        a.add(i);
//                        if (a.size() >= 3) {
//                            for (int b = 2 ; b < a.size()-2 ; b++) {
//                                System.out.println(a.get(a.size() - 1) + "          " + a.get(a.size() - b));
//                                if (a.get(a.size() - 1) % a.get(a.size() - b) == 0) a.remove(a.size() - 1);
//                            }
//                        }
//                        break;
//                    }
//                }
//                if (k <= 2) flag = false;
//            }
//            int[] answer = new int[a.size() - 1];
//            for (int i = 0; i < a.size() - 1; i++) {
//                answer[i] = a.get(i + 1);
//            }
//            System.out.println(Arrays.toString(answer));
//
//        }
//        for (int n = 1; n <= 100 ; n++) {
//            List<Integer> a = new ArrayList<>();
//            int k = n;
//            a.add(1);
//
//            boolean flag = true;
//            while (flag) {
//                k /= a.get(a.size() - 1);
//                for (int i = 2; i <= k ; i++) {
//                    if (k%i==0) {
//                        a.add(i);
//                        break;
//                    }
//                }
//                if (k <= 2) flag = false;
//            }
//            a = new ArrayList<>(new HashSet<>(a));
//
//            int[] answer = new int[a.size() - 1];
//            for (int i = 0; i < a.size() - 1; i++) {
//                answer[i] = a.get(i + 1);
//            }
//            System.out.println(Arrays.toString(answer));
//        }
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;
        int count = (2 * k) / numbers.length + 1 ;
        List<Integer> l = new ArrayList<>();
        int answer = 0;

        for (int i = 1 ; i <= count ; i++) for (int n : numbers) l.add(n);
        for (int i = 0 ; i < k ; i++) answer = l.get(i*2);

        System.out.println(answer);

        System.out.println(-5 + 3 * 10 / -2);

//        System.out.println(Arrays.toString(answer));
//        System.out.println(answer);

    }
}
