package _00_CodeTest;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4};

        int tmp = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            tmp+=arr[i];
        }

        int[] answer = new int[tmp];
        tmp = -1;
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
            for(int j = 1 ; j <= arr[i] ; j++) {
                answer[tmp+j] = arr[i];
            }
            tmp += arr[i];
            System.out.println(tmp);
        }


    }
}
