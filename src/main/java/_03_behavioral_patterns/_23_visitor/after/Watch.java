package _03_behavioral_patterns._23_visitor.after;

public class Watch implements Device {

    @Override
    public void print(Circle circle) {
        System.out.println("Print to Circle to Watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Print to Rectangle to Watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Print to Triangle to Watch");
    }
}
