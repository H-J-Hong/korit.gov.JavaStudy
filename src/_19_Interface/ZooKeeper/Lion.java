package _19_Interface.ZooKeeper;

public class Lion extends Animal implements Predator {
    @Override
    public String getFood() {
        return "바나나";
    }
}
