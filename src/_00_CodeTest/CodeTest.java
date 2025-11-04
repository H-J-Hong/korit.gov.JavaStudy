package _00_CodeTest;

import _20_Casting.Animals2.Soundable;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
//        for (String star = "*" ; star.length() <= 5 ; star+="*") System.out.println(star);
        String my_str = "abc1Addfggg4556b";
        int n = 6;


        String[] answer = new String[(my_str.length()+(n-1))/n];
        for (int i = 0 ; i < (my_str.length()+(n-1))/n ; i++) {
            answer[i] = my_str.substring(i*n,Math.max(((i+1)*n),my_str.length()));
        }

        System.out.println(Arrays.toString(answer));
    }
}
