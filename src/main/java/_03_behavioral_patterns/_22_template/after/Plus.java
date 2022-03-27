package _03_behavioral_patterns._22_template.after;

public class Plus extends FileProcessor{

    public Plus(String path) {
        super(path);
    }

    @Override
    int getResult(int result, int number) {
        return result += number;
    }
}
