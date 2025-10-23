package _00_CodeTest;

import java.util.Arrays;

public class CodeTest {
    public static void main(String[] args) {
        int n = 10;
        int a = n;
        int i = 0;

        while(true) {
            i++;
            System.out.println((a / 2) + " vs " + (a * 3) + 1);
            if (a % 2 == 0) a/=2; else a=(3*a) + 1;
            System.out.println("[" + i + "] = " + a);
            if (a == 1) break;
            if (i > 10) break;
        }
    }
}
