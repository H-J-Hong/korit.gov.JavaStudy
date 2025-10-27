package _19_Interface.SmartDevice;

public class Main {
    public static void main(String[] args) {
        SmartAirConditioner smartAirConditioner = new SmartAirConditioner();
        SmartLight smartLight = new SmartLight();
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        SmartHomeHub smartHomeHub = new SmartHomeHub(smartAirConditioner, smartLight, smartSpeaker);

        smartHomeHub.turnOn();

        smartHomeHub.showStatus();
        System.out.println();
        System.out.println();
        System.out.println(smartAirConditioner.getName());
        smartAirConditioner.turnOn();
        smartHomeHub.showStatus();
        smartAirConditioner.temperatureDown();
        smartAirConditioner.temperatureUp();
        smartAirConditioner.turnOff();
        smartAirConditioner.temperatureDown();
        smartAirConditioner.temperatureUp();

        smartHomeHub.showStatus();
        System.out.println();
        System.out.println();
        System.out.println(smartLight.getName());
        smartLight.turnOn();
        smartHomeHub.showStatus();
        smartLight.brightnessDown();
        smartLight.brightnessUp();
        smartLight.turnOff();
        smartLight.brightnessDown();
        smartLight.brightnessUp();

        smartHomeHub.showStatus();
        System.out.println();
        System.out.println();
        System.out.println(smartSpeaker.getName());
        smartSpeaker.turnOn();
        smartHomeHub.showStatus();
        smartSpeaker.playMusic("발라드");
        smartSpeaker.playMusic("힙합");
        smartSpeaker.turnOff();
        smartSpeaker.playMusic("발라드");
        smartSpeaker.playMusic("힙합");

        System.out.println();
        System.out.println();
        System.out.println(smartHomeHub.getName());
        smartHomeHub.turnOnAll();
        smartHomeHub.showStatus();
        smartAirConditioner.temperatureUp();
        smartAirConditioner.temperatureDown();
        smartLight.brightnessDown();
        smartLight.brightnessUp();
        smartSpeaker.playMusic("발라드");
        smartSpeaker.playMusic("힙합");
        smartHomeHub.turnOffAll();
        smartAirConditioner.temperatureUp();
        smartAirConditioner.temperatureDown();
        smartLight.brightnessDown();
        smartLight.brightnessUp();
        smartSpeaker.playMusic("발라드");
        smartSpeaker.playMusic("힙합");
        smartHomeHub.showStatus();
        smartHomeHub.turnOff();
        smartHomeHub.showStatus();
    }
}
