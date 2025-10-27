package _19_Interface.SmartDevice;

/*
 * SmartLight 클래스를 만들고 SmartDevice를 상속
 * 고유 속성
 * boolean turnedOn
 * int brightness = 50
        * 고유 메소드
 * 1. 밝기 올리기 내리기 두가지
 * 2. 전원이 꺼져 있다면 "현재 전원이 꺼져 있습니다." 출력후 작동되지 않도록.
 * 3. 10씩 증감.
*/

public class SmartLight implements SmartDevice {
    private boolean turnedOn;
    private int brightness = 50;
    private String name = "스마트 전구";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void turnOn() {
        this.turnedOn = true;
        System.out.println(this.getName() + "의 전원을 켭니다. 설정 밝기 : " + this.brightness + "");
    }

    @Override
    public void turnOff() {
        this.turnedOn = false;
        System.out.println(this.getName() + "의 전원을 끕니다.");
    }

    @Override
    public boolean isTurnedOn() {
        return this.turnedOn;
    }

    public void brightnessUp() {
        if (this.isTurnedOn()) {
            this.brightness += 10;
            System.out.println("밝기를 " + this.brightness + "로 설정합니다.");
        } else {
            System.out.println(this.getName() + "의 전원이 꺼져 있습니다.");
        }
    }

    public void brightnessDown() {
        if (this.isTurnedOn()) {
            this.brightness -= 10;
            System.out.println("밝기를 " + this.brightness + "로 설정합니다.");
        } else {
            System.out.println(this.getName() + "의 전원이 꺼져 있습니다.");
        }
    }
}
