package _00_CodeTest;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        int[][] answer = new int[num_list.length/n][n];
        for (int i = 0 ; i < num_list.length ; i++) {
            System.out.println(i/n + " , " + i%n);
            answer[i/n][i%n] = num_list[i];
        }
        System.out.println(Arrays.deepToString(answer));
    }
}
