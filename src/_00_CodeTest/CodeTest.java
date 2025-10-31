package _00_CodeTest;

import _20_Casting.Animals2.Soundable;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
//        for (String star = "*" ; star.length() <= 5 ; star+="*") System.out.println(star);
        int[] arr = {1, 2, 1, 4, 5, 2, 9};

        int f = 0;
        int l = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == 2) {
                f = i;
                break;
            }

        }
        for (int i = arr.length-1 ; i >= 0 ; i--) {
            if (arr[i] == 2) {
                l = i;
                break;
            }

        }
        System.out.println(l-f);

        int z = 0;
        if (f == l) System.out.println(Arrays.toString(new int[] {2}));
        else if (f + l < 0) System.out.println(Arrays.toString(new int[] {-1}));
        int[] answer = new int[l-f+1];

        for (int i = f ; i <= l ; i++) {
            answer[z] = arr[i];
            z++;
        }
        System.out.println(Arrays.toString(answer));
    }
}
