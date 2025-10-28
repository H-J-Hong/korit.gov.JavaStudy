package _21_Objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }

//    args에 같은 자료형인 필드를 같은 수량 만큼 받는 경우 생성자 추가 불가!!
//    public Teacher(String schoolName) {
//        this.schoolName = schoolName;
//    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

//     원래는 객체의 해시코드를 반환하는 코드이나, 읽기 편한 방식으로 재정의(Override) 해서 사용 가능하다.
    @Override
    public String toString() {
        return this.name + " 선생님의 " + this.schoolName + " 수업 입니다.";
    }

//    원래는 두 객체의 참조 주소를 비교하는 코드이나, 반환값이 같은지를 비교하도록 Override 해서 사용 가능하다.(값 기반 비교)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("자기 자신과 비교한다!");
            return true;
        }
        if (!(obj instanceof Teacher)) {
            System.out.println("다른 클래스와 비교한다!");
            return false;
        }
//        1. 비교하는 객체의 메모리 주소가 같다면 자기 자신을 비교하는 것이므로 true 반환
//        2. 비교하는 객체가 Teacher의 인스턴스가 아니라면 아예 다른 클래스인 객체를 비교하는 것이므로 false 반환

        Teacher t = (Teacher) obj;
        return this.name.equals(t.name) && this.schoolName.equals(t.schoolName);
//        비교하는 두 객체의 필드 내용이 모두 같을때 true 반환, 필드 내용이 다르면 false 반환
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,this.schoolName);
    }

//    equals로 같다고 판별된 객체는 같은 해시코드를 가져야 한다는 자바의 공식 규칙
//    equals()를 Override한다면 hashCode()도 Override를 사용하여 재정의 해야 한다.
//    hashCode()를 Override 했다고 해서 equals()를 Override해서 재정의 해야 하는 것은 아님.
}
