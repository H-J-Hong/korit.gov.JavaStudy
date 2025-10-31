package _26_Singleton;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString
public class LogManager {
    /*
    * 싱글톤 (Singleton)
    * 어플리케이션 전체에서 단 하나의 인스턴스를 공유하도록 하는 패턴
    * 생성 행위 중 하나.
    * 객체를 여러번 만들 필요가 없이 한번만 만들어 재사용 가능.
    *
    * 싱글톤을 사용 하는 이유
    * 1. 메모리 절약 => 객체를 하나만 생성하여 재활용 하므로 메모리를 효율적으로 사용.
    * 2. 일관성 유지 => 하나의 인스턴스를 공유하기 때문에 데이터의 일관성을 유지.
    * 3. 전역 상태 관리 => 객체를 전역적으로 접근 가능.
    * 4. 자원 관리 => 데이터베이스 연결 객체 서버에서 단 하나만 존재해야 하기 때문에 이때 싱글톤을 사용
    *
    * 단점
    * 1. 테스트 어려움 => 전역적인 접근성을 가지므로 객체간의 의존성이 높아지고 객체간의 테스트 어려워짐.
    * 2. 높은 결합도 => 하나의 인스턴스를 공유하기 때문에 싱글톤 클래스의 수정은 다른 모든 클래스에 영향을 줌.
    * */

//   유일한 인스턴스를 담는 정적 변수
//   객체 생성 없이 인스턴스를 담아 두는 공간
    private static LogManager instance;

//   생성자를 private로 막아서 외부에서 객체 생성 막기
    private LogManager() {}

//    static 이므로 객체 선언 없이 클래스 단계에서 호출 가능
    public static LogManager getInstance() {
        if (instance == null) {
//            첫번째만 실행 되고 두번째 호출 되더라도 실행이 되지 않음.
            System.out.println("객체 생성됨");
            instance = new LogManager();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

}
