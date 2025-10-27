package _19_Interface.SmartDevice;

/*
 * SmartAirConditioner 클래스를 만들고 SmartDevice를 상속
 * 고유 속성
 * boolean turnedOn
 * int temperature = 24
 * getName => "스마트 에어컨" 리턴
 * turnOn => "getName() 의 전원을 켭니다. 설정 온도 : temperature 도" 출력, turnedOn = true
 * turnOff => turnOn과 반대로 작동
 * isTurnedOn => 현재 전원 상태 리턴
 * 고유 메소드
 * 1. 온도 올리기 온도 내리기 두가지
 * 2. 전원이 꺼져 있다면 "현재 전원이 꺼져 있습니다." 출력후 작동되지 않도록.
*/


public class SmartAirConditioner implements SmartDevice {
    private boolean turnedOn;
    private int temperature = 24;
    private String name = "스마트 에어컨";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void turnOn() {
        this.turnedOn = true;
        System.out.println(this.getName() + "의 전원을 켭니다. 설정 온도 : " + this.temperature + " 도");
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

    public void temperatureUp() {
        if (this.isTurnedOn()) {
            this.temperature += 1;
            System.out.println("온도를 " + this.temperature + "로 설정합니다.");
        } else {
            System.out.println(this.getName() + "의 전원이 꺼져 있습니다.");
        }
    }

    public void temperatureDown() {
        if (this.isTurnedOn()) {
            this.temperature -= 1;
            System.out.println("온도를 " + this.temperature + "로 설정합니다.");
        } else {
            System.out.println(this.getName() + "의 전원이 꺼져 있습니다.");
        }
    }
}
