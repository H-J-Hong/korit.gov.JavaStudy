package _26_Singleton.AppConfig;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppConfig {
    private static AppConfig instance;

    private String apiKey;
    private String appMode;

    private AppConfig() {
        this.apiKey = "DEFAULT_KEY";
        this.appMode = "PRODUCTION";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
}
