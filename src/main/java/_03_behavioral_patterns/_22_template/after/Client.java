package _03_behavioral_patterns._22_template.after;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        int result = fileProcessor.process();
        System.out.println("result = " + result);
    }
}
