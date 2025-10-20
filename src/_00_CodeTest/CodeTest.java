package _00_CodeTest;

public class CodeTest {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        String answer = "";
        for (int i = 0 ; i < my_string.length() ; i++) {
            System.out.println(my_string.substring(i,i+1));
            System.out.println(my_string.substring(i,i+1).equals(letter));
            if (my_string.substring(i,i+1) == letter) {
                answer += "";
                continue;
            } else {
                answer += my_string.substring(i,i+1);
            }

        }
        System.out.println(answer);
    }
}
