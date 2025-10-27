package _20_Casting.Animals;

/*
* 업캐스팅 (자식 -> 부모)
*
* */

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speak();
        dog1.wagTail();

//        업캐스팅 (자식 -> 부모)
//        animal은 Animal 클래스 타입이지만 내부적으로 Dog의 객체
        Animal a = new Dog();
        a.speak();
//        부모는 자식만이 가지고 있는 성질을 가질 수는 없으므로 작동 불가
//        animal.wagTail();

//        다운캐스팅 (부모 -> 자식)
//        Animal을 Dog클래스를 참조하여 wagTail() 메소드를 호출한다.
        ((Dog)a).wagTail();

        Animal a2 = dog1;        // a2는 Animal 클래스 타입.
        Dog dog2 = (Dog) a2;    // a2를 Dog 클래스 타입으로 다운 캐스팅 하여 dog2에 대입.

        a2.setName("덕구");
        System.out.println(dog2.getName());

//        다양한 자식들을 하나의 클래스 타입으로 처리할 수 있다.
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog[] dogs = { dog3, dog4, dog5 };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();

        Animal[] animals = { dog, cat, tiger };

//        부모의 성질을 활용해 배열로 묶었으므로 부모의 성질만 호출 가능!!
        for (Animal animal : animals) {
            animal.speak();
//            animal.wagTail();         // 호출 불가
        }
    }
}
