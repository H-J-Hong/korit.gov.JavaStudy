package _19_Interface.TvRemoteController;

public abstract class Button implements Press, Up, Down {
//    "위나 아래로 누르고 있음" 기능은 버튼에 따라 필요하지 않을수도 있으므로
//    자식 클래스에서 용도에 따라 오버라이드하여 재정의 해서 사용하도록 - *일반 메소드로 지정함*
    @Override
    public void onUp() {

    }

    @Override
    public void onDown() {

    }

//    버튼에서 한번 누름은 반드시 구현되어야 하는 필수 기능 - *추상 메소드로 지정함*
    @Override
    public abstract void onPressed();
}
