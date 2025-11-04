package _00_CodeTest;

import _20_Casting.Animals2.Soundable;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 1, 1, 0 };

        int[] answer = new int[0];

        for (int i = 0 ; i < arr.length ; i++) {
            if (answer.length == 0) {
                int[] tmp = new int[1];
                tmp[0] = arr[i];
                answer = tmp;
            } else if (answer[answer.length-1] == arr[i]) {
                int[] tmp = Arrays.copyOf(answer, answer.length - 1);
                answer = tmp;
            } else if (answer[answer.length-1] != arr[i]) {
                int[] tmp = new int[answer.length+1];
                for (int j = 0 ; j < answer.length ; j++) {
                    tmp[j] = arr[j];
                }
                tmp[tmp.length-1] = arr[i];
                answer = tmp;
            }
        }
        if (answer.length == 0) {
            int[] tmp = new int[] {-1};
            answer = tmp;
        }
        System.out.println(Arrays.toString(answer));



    }
}
