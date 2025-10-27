package _00_CodeTest;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
        String my_string = " i    love  you";

        int a = my_string.length();
        int z = 0;
        String[] tmp = new String[a];
        for (int i = 0 ; i < a ; i++) tmp[i] = "";

        char[] tmp2 = my_string.toCharArray();
        for (char i : tmp2) {
            if (i != ' ') {
                tmp[z] += String.valueOf(i);
            } else {
                z++;
            }
        }

        int y = 0;
        for (int i = 0 ; i < a ; i++) {
            if (tmp[i] != "") y++;
        }

        String[] answer = new String[y];
        int x = 0;
        for (int i = 0 ; i < a ; i++) {
            if (tmp[i] != "") {
                answer[x] = tmp[i];
                x++;
            }
        }

        System.out.println(Arrays.toString(answer));



    }
}
