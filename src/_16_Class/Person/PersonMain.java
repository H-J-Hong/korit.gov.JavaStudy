package _16_Class.Person;

public class PersonMain {
    public static void main(String[] args) {
//        OOP 클래스와 PersonMain 결과 비교!!
        Person person = new Person();          // public은 어디서나 접근 가능
//        Person1 person1 = new Person1();        // private는 같은 패키지 같은 클래스 내에서만 접근 가능
//        Person2 person2 = new Person2();        // default(생략가능)는 같은 패키지 내에서만 접근 가능

        person.setId("801016-1000000");         // private는 클래스 내부 메소드인 setId()로만 접근 가능
        person.email = "ghdgowns@gmail.com";    // protected는 같은 패키지 내에서 접근하여 직접 내용 변경 가능
        person.name = "홍해준";                    // public은 어디서나 접근하여 내용 변경 가능
        person.address = "부산광역시 사하구";       // address는 default이므로 같은 패키지 내에서 접근 가능

        System.out.println(person.getId());
        person.showInfo();


    }
}
