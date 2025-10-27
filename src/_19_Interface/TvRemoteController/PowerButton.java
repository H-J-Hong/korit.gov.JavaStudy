package _19_Interface.TvRemoteController;

/*
* PowerButton 일반 클래스는 Button이라는 추상 클래스를 상속 받음
* Button이라는 추상 클래스는 Press라는 인터페이스를 implements(상속?)함
*
* extends - 단일 상속 (클래스)
* implements - 다중 상속 (인터페이스)
* */

public class PowerButton extends Button{
    private boolean status;

    @Override
    public void onPressed() {
        if (status) {
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }

}
