package _19_Interface.SmartDevice;

/*
 * SmartSpeaker 클래스를 만들고 SmartDevice를 상속
 * 고유 속성
 * boolean turnedOn
 * String playListName = "발라드";
 * 고유 메소드
 * 1. playListName을 파라미터로 받아서 재생하는 메소드
 * 2. 전원이 꺼져 있다면 "현재 전원이 꺼져 있습니다." 출력후 작동되지 않도록.
*/


public class SmartSpeaker implements SmartDevice {
    private boolean turnedOn;
    private String playListName = "";
    private String name = "스마트 스피커";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void turnOn() {
        this.turnedOn = true;
        System.out.println(this.getName() + "의 전원을 켭니다.");
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

    public void playMusic(String playListName) {
        if (this.isTurnedOn()) {
            this.playListName = playListName;
            System.out.println(this.playListName + "을 재생합니다.");
        } else {
            System.out.println(this.getName() + "의 전원이 꺼져 있습니다.");
        }
    }
}
