package _19_Interface.SmartDevice;

/*
 * SmartHomeHub
 * 필드에 각 가전이 들어 있음
 * 고유 메소드
 * 1. turnOnAll() => 모든 가전 전원을 켬
 * 2. turnOffAll() => 모든 가전의 전원을 끔
 * 3. showStatus() => 모든 가전의 전원 상태 출력
*/


public class SmartHomeHub implements SmartDevice{
    private boolean turnedOn;
    private String name = "스마트 홈허브";
    private SmartSpeaker smartSpeaker;
    private SmartLight smartLight;
    private SmartAirConditioner smartAirConditioner;

    public SmartHomeHub(SmartAirConditioner smartAirConditioner, SmartLight smartLight, SmartSpeaker smartSpeaker) {
        this.smartAirConditioner = smartAirConditioner;
        this.smartLight = smartLight;
        this.smartSpeaker = smartSpeaker;
    }

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

    public void turnOnAll() {
        if (this.turnedOn) {
            this.smartSpeaker.turnOn();
            this.smartLight.turnOn();
            this.smartAirConditioner.turnOn();
            System.out.println("모든 스마트 가전의 전원을 켭니다.");
        } else {
            System.out.println(this.getName() + "의 전원이 꺼져 있습니다.");
        }
    }

    public void turnOffAll() {
        if (this.turnedOn) {
            this.smartSpeaker.turnOff();
            this.smartLight.turnOff();
            this.smartAirConditioner.turnOff();
            System.out.println("모든 스마트 가전의 전원을 끕니다.");
        } else {
            System.out.println(this.getName() + "의 전원이 꺼져 있습니다.");
        }
    }

    public void showStatus() {
        System.out.println("================================");
        System.out.println("*** 현재 연결된 가전의 전원 정보 ***");
        System.out.println("================================");
        System.out.println("스마트 에어컨 : " + (this.smartAirConditioner.isTurnedOn() ? "켜짐" : "꺼짐"));
        System.out.println("스마트 전구   : " + (this.smartLight.isTurnedOn() ? "켜짐" : "꺼짐"));
        System.out.println("스마트 스피커 : " + (this.smartSpeaker.isTurnedOn() ? "켜짐" : "꺼짐"));
        System.out.println("================================");
    }

}
