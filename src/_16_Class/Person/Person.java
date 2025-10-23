package _16_Class.Person;

/*
 * 접근제어자의 종류
 * 1. public - 어디서든 접근 가능
 * 2. protected - 같은 패키지 또는 자식 클래스에서만 접근 가능 (상속 학습후 재설명)
 * 3. default - 같은 패키지 에서만 접근 가능 (명시하지 않았으면 default)
 * 4. private - 해당 클래스 내부에서만 접근 가능.
 *
 * - Class에는 private를 적용할 수 없다.
 * */


public class Person {
    public String name;
    protected String email;
    String address;
    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void showInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("메일 : " + this.email);
        System.out.println("주소 : " + this.address);
        System.out.println("주민번호 : " + this.id);
    }

}

//private class Person1 {
//    String name;
//    String email;
//    String address;
//    String id;
//}

//class Person2 {
//    String name;
//    String email;
//    String address;
//    String id;
//}
