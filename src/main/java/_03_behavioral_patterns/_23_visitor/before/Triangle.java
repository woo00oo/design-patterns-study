package _03_behavioral_patterns._23_visitor.before;

public class Triangle implements Shape{

    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("print Triangle to phone");
        } else if (device instanceof Watch) {
            System.out.println("print Triangle to watch");
        }
    }
}
