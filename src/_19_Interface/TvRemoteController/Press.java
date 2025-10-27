package _19_Interface.TvRemoteController;

/*
* 인터페이스는 기능(메소드)의 명세 - 규칙이나 약속 - 만 정의하는 틀
* 인터페이스 자체로는 객체 생성 불가
* 다중 상속이 가능함.
*
* 인터페이스의 용도.
* 1. 기능 중심의 설계를 할때
* 2. 여러 클래스에서 같은 행동을 다르게 구현할 때
* 3. 다형성을 극대화 시킬때
* */

public interface Press {
    void onPressed();

}
