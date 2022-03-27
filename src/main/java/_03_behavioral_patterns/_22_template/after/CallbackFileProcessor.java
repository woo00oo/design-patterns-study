package _03_behavioral_patterns._22_template.after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CallbackFileProcessor {

    private String path;

    public CallbackFileProcessor(String path) {
        this.path = path;
    }

    public int process(Operator operator) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while ( (line = reader.readLine()) != null ) {
                result = operator.getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

}
