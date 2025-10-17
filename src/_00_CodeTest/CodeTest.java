package _00_CodeTest;

public class CodeTest {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        String answer = "";
        for (int i = 1 ; i <= my_string.length() ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.println(my_string.substring(i-1,i));
                answer += my_string.substring(i-1,i);
            }
        }
        System.out.println(answer);
    }
}
