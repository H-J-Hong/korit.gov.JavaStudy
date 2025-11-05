package _00_CodeTest;

import _20_Casting.Animals2.Soundable;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
//        int[] arr = new int[] { 0, 1, 1, 1, 0 };
//
//        && !(i%a.get(a.size()-1) == 0 && i>=a.get(a.size()-1))
        int n = 252;

        List<Integer> a = new ArrayList<>();
        int k = n;
        a.add(1);

        boolean flag = true;
        while(flag) {
            k /= a.get(a.size()-1);
            for (int i = 2; i <= k ; i++) {
                System.out.println(i + "     " + k + "     " + a);
                if (k%i == 0 && !a.contains(i)) {
                    a.add(i);
                    if (a.size() >= 3){
                        if (a.get(a.size()-1)%a.get(a.size()-2) == 0) a.remove(a.size()-1);
                    }
                    break;
                }
            }
            if (k <= 2) flag = false;
        }
        int[] answer = new int[a.size()-1];
        for (int i = 0; i < a.size()-1; i++) {
            answer[i] = a.get(i+1);
        }
        System.out.println(Arrays.toString(answer));



    }
}
