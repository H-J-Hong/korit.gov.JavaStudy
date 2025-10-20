package _00_CodeTest;

public class CodeTest {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int prod = 1;
        int sumpow = 0;
        for (int i = 0 ; i < num_list.length ; i++) {
            prod *= num_list[i];
            sumpow += num_list[i]*num_list[i];
            System.out.println(prod);
            System.out.println(sumpow);
        }
        System.out.println(prod > sumpow ? 0 : 1);

    }
}
