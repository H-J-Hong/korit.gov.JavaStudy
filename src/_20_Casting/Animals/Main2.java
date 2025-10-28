package _20_Casting.Animals;

public class Main2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Animal animal1 = new Animal();

//        instanceof 연산자
//        용법) 객체 instanceof 클래스 - 객체는 해당 클래스의 인스턴스이거나 해당 클래스의 자식 클래스의 인스턴스 입니까?
//        결과값은 boolean
        boolean result1 = animal1 instanceof Animal;
        boolean result2 = animal1 instanceof Dog;

        System.out.println(result1);
        System.out.println(result2);

        boolean result3 = dog1 instanceof Dog;
        boolean result4 = dog1 instanceof Animal;

        System.out.println(result3);
        System.out.println(result4);

        Animal animal2 = new Dog();
        ((Dog)animal2).wagTail();
        if(animal2 instanceof Dog dog2) {       //  animal2가 Dog의 인스턴스가 맞으면 dog2로 다운캐스팅 하겠다!
//            Dog dog2 = (Dog) animal2;
            dog2.wagTail();     // ClassCastException 방지
        } else {
            System.out.println("불가능한 다운캐스팅 입니다.");
        }


    }
}
