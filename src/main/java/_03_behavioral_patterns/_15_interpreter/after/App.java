package _03_behavioral_patterns._15_interpreter.after;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println("result = " + result);
    }
}

/*
    인터프리터 패턴
    > 요청을 캡슐화하여 호출자(invoker)와 수신자(receiver)를 분리하는 패턴.

    장점
    - 자주 등장하는 문제 패턴을 언어와 문법으로 정의할 수 있다.
    - 기존 코드를 변경하지 않고 새로운 Expression을 추가할 수 있다.

    단점
    - 복잡한 문법을 표현하려면 Expression과 Parser가 복잡해진다.

 */