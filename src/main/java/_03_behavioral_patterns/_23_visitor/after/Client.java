package _03_behavioral_patterns._23_visitor.after;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device phone = new Phone();
        rectangle.accept(phone);
    }
}
