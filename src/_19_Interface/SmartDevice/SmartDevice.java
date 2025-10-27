package _19_Interface.SmartDevice;

/*
 * Interface SmartDevice
 * 메소드 종류
 * getName => String 반환
 * turnOn, turnOn => void 반환
 * isTurnedOn => boolean 반환
*/

public interface SmartDevice {
    String getName();
    void turnOn();
    void turnOff();
    boolean isTurnedOn();
}
