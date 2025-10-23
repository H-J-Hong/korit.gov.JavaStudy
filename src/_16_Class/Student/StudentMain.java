package _16_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student stu1 = new Student("홍길동", 1, "aaa@bbb.com", "서울광역시 종로구");
//        public 이나 default로 선언된 필드는 직접 접근 가능하다.
//        stu1.name = "홍해준";
//        System.out.println(stu1.name);
//        stu1.age = 45;
//        stu1.address = "부산광역시 사하구";
//        stu1.email = "ghdgowns@gmail.com";

//        private로 선언된 필드는 내부 메소드를 사용하여 접근하여야 한다.
        stu1.setName("홍해준");
        stu1.setAge(45);
        stu1.setAddress("부산광역시 사하구");
        stu1.setEmail("ghdgowns@gmail.com");

        stu1.showInfo();

        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getAddress());
        System.out.println(stu1.getEmail());

    }
}
