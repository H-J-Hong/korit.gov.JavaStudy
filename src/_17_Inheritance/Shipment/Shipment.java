package _17_Inheritance.Shipment;

/*
 * 클래스 Shipment
 * 속성은 출발지, 목적지
 * allargs 생성자
 * route() 메소드 리턴 예 => "부산 -> 서울"
 * calcFee() 메소드 파라미터 무게와 거리 리턴은 그냥 0을 리턴
 * calcFee는 자식클래스에서 재정의 할 예정
 * */


public class Shipment {
    private String from;
    private String to;

    public Shipment(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String route() {
        return from + " -> " + to;
    }

    public int calcFee(int weight, int distance) {
        return 0;
    }
}
