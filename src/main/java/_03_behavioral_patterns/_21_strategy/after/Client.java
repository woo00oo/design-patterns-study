package _03_behavioral_patterns._21_strategy.after;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight(new Normal());
        game.blueLight();
        game.redLight();
    }
}
