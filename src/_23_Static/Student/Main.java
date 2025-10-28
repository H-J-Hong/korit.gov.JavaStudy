package _23_Static.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(Student.curriculum);
        System.out.println(student.getStatic());
        Student student1 = new Student();
        student.setCurriculum1("국비");
        student1.setCurriculum1("국비");
        System.out.println(student1.getStatic());
        System.out.println(student1.getStatic()==student.getStatic());
        System.out.println(student1.curriculum==student.curriculum);
    }
}
