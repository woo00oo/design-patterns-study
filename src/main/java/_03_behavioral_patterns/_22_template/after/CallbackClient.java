package _03_behavioral_patterns._22_template.after;

public class CallbackClient {

    public static void main(String[] args) {
        CallbackFileProcessor fileProcessor = new CallbackFileProcessor("number.txt");
        int result = fileProcessor.process((result1, number) -> result1 += number);
        System.out.println("result = " + result);
    }
}
