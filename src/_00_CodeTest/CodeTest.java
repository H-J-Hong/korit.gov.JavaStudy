package _00_CodeTest;

import java.util.Arrays;

public class CodeTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};
//        String my_string = "hi12392";

//        System.out.println(my_string.charAt(0));
        int answer = 0;
        for (int i = 0 ; i < numbers.length ; i++) {
            System.out.println("i=" + i);
            for (int j = i+1 ; j < numbers.length ; j++) {
                System.out.println("j=" + j);
                System.out.println(numbers[i] * numbers[j]);
                answer = ((answer > numbers[i] * numbers[j]) ? answer : numbers[i] * numbers[j]);
            }
        }
        System.out.println(answer);
    }
}
