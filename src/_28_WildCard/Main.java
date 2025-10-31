package _28_WildCard;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        Dog dog  = new Dog();
        dogBox.setValue(dog);
        Box<Cat> catBox = new Box<>();
        catBox.setValue(new Cat());

        Unbounded.inspect(dogBox);
        Unbounded.inspect(catBox);

        System.out.println("========================== 어퍼 바운드");


        Box<Corgi> corgiBox = new Box<>();
        corgiBox.setValue(new Corgi());
        UpperBounded.inspect(dogBox);
        UpperBounded.inspect(corgiBox);
//        UpperBounded.inspect(catBox);         // catBox는 Cat를 상속받지 않았으므로 불가능

        System.out.println("========================== 로워 바운드");
        Box<Animal> animalBox = new Box<>();
        Box<Object> objectBox = new Box<>();
        LowerBounded.putDog(animalBox);
        LowerBounded.putDog(objectBox);
//        LowerBounded.putDog(Cat);
//        LowerBounded.putDog(Dog);
        String a;

    }
}
