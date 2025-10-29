package _00_CodeTest;

import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};

        String tmp = "";
        int i = 0;
        for(boolean z : flag) {
            if(z) {
                for (int j = 0; j < arr[i] * 2; j++) tmp += arr[i] + "";
            }
            else {
                tmp = tmp.substring(0,tmp.length()-arr[i]);
            }
            i++;
        }

        System.out.println(tmp);

        String[] tmp2 = tmp.split("");
        int[] answer = new int[tmp2.length];
        i = 0;
        for (String t : tmp2) {
            answer[i] = Integer.parseInt(tmp2[i]);
            i++;
        }

        System.out.println(Arrays.toString(answer));

//        String[][] morse = {
//                '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//                '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//                '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//                '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//                '-.--':'y','--..':'z'
//        };

    }
}
