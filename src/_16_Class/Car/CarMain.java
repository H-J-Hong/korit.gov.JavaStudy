package _16_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car audi = new Car();                   // NoArgs
        Car santafe = new Car("싼타페");   // 이름이 입력된 상태로 객체 생성
        Car sorento = new Car("쏘렌토", 2025, "검정색");

//        실행후 결과값 비교 확인!!!!

        audi.showInfo();
        santafe.showInfo();
        sorento.showInfo();

    }
}
