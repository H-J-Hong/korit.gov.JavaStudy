package _00_CodeTest;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 5;

        System.out.println(Arrays.toString(num_list));

        int[] answer = new int[num_list.length];
        int a = num_list.length;
        int[] before = new int[a-n-1];
        int[] after = new int[n];
        answer[0] = num_list[n];

        for (int i = 0 ; i < before.length ; i++) {
            before[i] = num_list[i+n+1];
        }

        System.out.println(Arrays.toString(before));

        for (int i = 0 ; i < after.length ; i++) {
            after[i] = num_list[i];
        }

        System.out.println(Arrays.toString(after));

        for (int i = 1 ; i < before.length + 1 ; i++) {
            answer[i] = before[i-1];
        }

        for (int i = before.length+1 ; i < before.length + after.length + 1 ; i++) {
            answer[i] = after[i-before.length-1];
        }

        System.out.println(Arrays.toString(answer));



    }
}
