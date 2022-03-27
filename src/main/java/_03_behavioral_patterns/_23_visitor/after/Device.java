package _03_behavioral_patterns._23_visitor.after;

public interface Device {

    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
