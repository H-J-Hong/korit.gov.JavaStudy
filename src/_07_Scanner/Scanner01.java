package _07_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Scanner 입력
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        System.out.println("str1 : " + str1);
//        System.out.println("str2 : " + str2);

//        nextLine() => 엔터 단위로 읽는다. 한줄을 읽음
//        String str3 = scanner.nextLine();
//        System.out.println("str3 : " + str3);

//        int 정수 입력 받기
//        nextInt() 개행문자 \n을 무시하고 입력받는다
//        엔터를 치면 엔터 전까지 입력받고 엔터의 개행문자는 남게 됨
//        int num1 = scanner.nextInt();
//        System.out.println("num1 : " + num1);
//        int num2 = scanner.nextInt();
//        System.out.println("num2 : " + num2);

//        int num = scanner.nextInt();                            // 123\n
//        scanner.nextLine();
//        String str = scanner.nextLine();
//        System.out.println("num1 : " + num + ", str : " + str);

//        1. 나이와 이름을 입력 받는다.
//        2. 출력예 : "27살 이동윤입니다."
//        3. 나이를 먼저 입력 받아야 한다.

        int _Age = scanner.nextInt();
        scanner.nextLine();
        String _Name = scanner.nextLine();
        System.out.println(_Age + "살 " + _Name + "입니다.");

    }
}
