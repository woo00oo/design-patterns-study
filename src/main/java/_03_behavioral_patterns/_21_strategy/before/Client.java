package _03_behavioral_patterns._21_strategy.before;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(1);
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
