package _21_Objects;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("이동윤", "국비");
        Teacher teacher2 = new Teacher("이동윤", "국비");

        System.out.println(teacher1.toString());
        System.out.println(teacher1);                    // 객체명으로만 호출하더라도 .toString()이 자동으로 호출됨.

        System.out.println(teacher1.equals(teacher2));  // hashCode()가 같아야 equals()의 결과가 true!! - Java의 규약
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
    }
}
