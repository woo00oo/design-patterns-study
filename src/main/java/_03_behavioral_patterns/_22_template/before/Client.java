package _03_behavioral_patterns._22_template.before;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process();
        System.out.println("result = " + result);
    }
}
