package _03_behavioral_patterns._22_template.after;

public class Multiply extends FileProcessor {

    public Multiply(String path) {
        super(path);
    }

    @Override
    int getResult(int result, int number) {
        return result *= number;
    }
}
