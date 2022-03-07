package singleton;

public class App {

    public static void main(String[] args) {

        SettingsV1 settingsV1 = SettingsV1.getInstance();

        System.out.println(settingsV1 == SettingsV1.getInstance());
    }
}
