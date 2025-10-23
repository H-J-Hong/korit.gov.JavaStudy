package _16_Class.Student;

public class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        System.out.println("AllArgsConstructor를 사용하였습니다.");
        System.out.println("필드는 name, age, email, address 4가지가 존재하며 get/set으로 접근 가능합니다.");
    }

//    getter / setter는 자동으로 생성 가능하다.
//    !!!!! ctrl + ins키 !!!!!

//    추상화
//    사용자가 class의 필드를 모두 알 필요는 없으나 메소드가 어떠한 기능을 하는지는 알려줘서 사용할 수 있도록 만드는 행위

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


//    void setName(String name) {
//        System.out.println("이름을 " + name + "(으)로 변경합니다.");
//        this.name = name;
//    }
//
//    String getName() {
//        return this.name;
//    }
//
//    void setAge(int age) {
//        System.out.println("나이를 " + age + "(으)로 변경합니다.");
//        this.age = age;
//    }
//
//    int getAge() {
//        return this.age;
//    }
//
//    void setEmail(String email) {
//        System.out.println("이메일을 " + email + "(으)로 변경합니다.");
//        this.email = email;
//    }
//
//    String getEmail() {
//        return this.email;
//    }
//
//    void setAddress(String address) {
//        System.out.println("주소를 " + address + "(으)로 변경합니다.");
//        this.address = address;
//    }
//
//    String getAddress() {
//        return this.address;
//    }

    public void showInfo() {
        System.out.println("===== 정보 출력 =====");
        System.out.println("이  름 : " + name);
        System.out.println("나  이 : " + age);
        System.out.println("이메일 : " + email);
        System.out.println("사는곳 : " + address);
    }
}
