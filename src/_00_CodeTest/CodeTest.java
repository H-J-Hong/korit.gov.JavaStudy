package _00_CodeTest;

public class CodeTest {
    public static void main(String[] args) {
        String my_string = "noraj";
        int len = my_string.length()-1;
        String answer = "";
        while (len >= 0) {
            answer += my_string.charAt(len);
            len--;
        }
        System.out.println(answer);
    }
}
