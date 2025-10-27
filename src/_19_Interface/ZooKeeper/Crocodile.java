package _19_Interface.ZooKeeper;

public class Crocodile extends Animal implements Predator {
    @Override
    public String getFood() {
        return "닭고기";
    }
}
