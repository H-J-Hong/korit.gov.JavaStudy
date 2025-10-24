package _18_Abstraction;

public class PhoneFactory extends Factory {
//    추상 클래스를 상속 받으면 반드시 추상 메소드를 선언해줘야 에러가 뜨지 않음.
    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
