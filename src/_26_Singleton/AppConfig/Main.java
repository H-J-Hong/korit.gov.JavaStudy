package _26_Singleton.AppConfig;

import java.rmi.server.ServerNotActiveException;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        config.setApiKey("TEST_KEY_123");
        config.setAppMode("DEBUG");

        AppConfig anotherconfig = AppConfig.getInstance();

        System.out.println(anotherconfig.getApiKey());
        System.out.println(anotherconfig.getAppMode());

        System.out.println(config == anotherconfig);
    }
}
