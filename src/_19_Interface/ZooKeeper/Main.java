package _19_Interface.ZooKeeper;

/*
* Animal 클래스
* 필드
* String name
* 메소드 : 세터
*
* Tiger 클래스 -> Animal 상속만 받은 상태
* Lion 클래스 -> Animal 상속만 받은 상태
* ZooKeeper 클래스 -> 상속 없음
* 1. feed 메소드
* 1) Tiger 클래스가 파라미터로 입력시  -> "사과를 던져준다."
* 2) Lion 클래스가 파라미터로 입력시 -> "바나나를 던져준다."
 * */

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        ZooKeeper zooKeeper = new ZooKeeper();

        zooKeeper.feed(lion);
        zooKeeper.feed(tiger);
        zooKeeper.feed(crocodile);
    }
}
