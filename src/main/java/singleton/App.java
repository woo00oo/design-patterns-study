package singleton;

public class App {

    public static void main(String[] args) {

        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();

        System.out.println(settings == settings1);
    }
}
