package _16_Class.Car;

public class Car {
//    속성 = 필드 = 멤버변수
    String carName;
    int carYearModel;
    String carColor;

//    Car클래스의 생성자 - 메소드와 비슷하지만 특별 취급
//    1. 생성자의 이름은 반드시 클래스와 동일해야 한다. (다를 경우 메소드로 인식)
//    2. 생성자의 반환값은 반드시 없어야 한다. (반환값이 존재할 경우 메소드로 인식)

//    ===== NoArgsConstructor =====
    Car() {
        System.out.println("객체가 생성되었습니다.");
        System.out.println("NoArgsConstructor");                // 아직 속성에 값이 입력되지 않은 빈껍데기
    }

//    NoArgsConstructor는 생략 가능!!

//    ===== RequiredArgsConstructor =====
//    필드 속성중 carName의 값만 주입하는 생성자

    Car(String carNm) {
        this.carName = carNm;                                   // this -> 생성된 객체 자신
        /*
        * this의 용법
        * 1. 해당 클래스(class)로 만들어진 자기 자신 객체(object)를 의미.
        * 2. 명확하게 언급이 되어야 할 경우 this 사용
        * 3. 필드의 변수이름과 매개변수의 이름이 다를 경우 this 생략 가능
        * */
        System.out.println("RequiredArgsConstructor");          // 생성될때 carName 필드가 입력됨.
    }

//    ===== AllArgsConstructor =====
//    모든 필드 값을 주입하는 생성자

    Car(String carName, int carYearModel, String carColor) {
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
        System.out.println("AllArgsConstructor");
    }

    public void startCar() {
        System.out.println(carName + "이(가) 시동을 겁니다");
    }

    public void drive() {
        System.out.println(carName + "이(가) 전진합니다");
    }

    public void stop() {
        System.out.println(carName + "이(가) 정지합니다");
    }

    public void showInfo() {
        System.out.println("자동차 이름은 " + carName);
        System.out.println("자동차 연식은 " + carYearModel);
        System.out.println("자동차 색상은 " + carColor);
    }
}
