package _23_Static.Student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    static String curriculum = "국비";
    private String name;
    private int age;
    private String curriculum1;

    public String getStatic() {
        return curriculum;
    }

    public String getStatic1() {
        return this.curriculum1;
    }

//    객체 선언이 필요 없는 변수는 클래스가 메모리에 로드 될때 이미 선언이 되어 있는 상태이므로
//    객체 선언이 필요한 메서드에서도 호출 가능하다.
}
