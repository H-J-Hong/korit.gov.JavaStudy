package _18_Abstraction;

public class Main {
    public static void main(String[] args) {
//        Factory fct = new Factory();                              // 추상 클래스 자체를 선언 할 수 없다.
        PhoneFactory pfct = new PhoneFactory();
        pfct.setFactoryName("애플 공장");
        pfct.produce("iPhone17");
        pfct.manage();
        pfct.displayInfo();

//        익명 클래스의 예 => 임시 생성
//        추상 클래스가 생성된 것이 아니라 추상 클래스의 자식 클래스가 생성된 것이다.
        Factory fct = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getFactoryName() + "에서 " + model + "을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println(super.getFactoryName() + "을 관리합니다.");
            }
        };
//        위와 같이 추상 클래스의 개념을 벗어나는 객체 생성은 익명 클래스라는 개념 덕분이다.
//        즉, 재사용 하지 않고 한번만 사용하고 버릴 생각이면 main에서 임시로 선언되는 익명 클래스가 유용하다.

        /*
        * 그렇다고 해서 추상 클래스 Factory의 객체가 생성된 것이 아닌 즉석에서 만들어진 이름없는 자식 클래스로 취급
        * 이름없는 자식 클래스 => 익명 클래스
        *
        * 그러므로 추상 클래스의 객체가 만들어진것이 아니지만, 추상 클래스의 개념은 지키고 있다.
        * */
        fct.setFactoryName("녹산공장");
        fct.produce("제품");
        fct.manage();

        PhoneFactory pfct2 = new PhoneFactory();
        pfct2.setFactoryName("삼성 공장");
        pfct2.displayInfo();
        pfct2.produce("갤럭시 S25");

        TabletFactory tfct1 = new TabletFactory();
        tfct1.setFactoryName("애플 태블릿 공장");
        tfct1.displayInfo();
        tfct1.produce("아이패드 미니 6세대");
        tfct1.manage();
        tfct1.upgrade("아이패드 미니 7세대");

    }
}
