package _00_CodeTest;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        String answer = "";
        int j = 0;
        for(String i : my_strings) {
            System.out.println(j);
            System.out.println(i.substring(parts[j][0],parts[j][1]));
            answer += i.substring(parts[j][0],parts[j][1]);
            j++;
        }

        System.out.println(answer);



    }
}
