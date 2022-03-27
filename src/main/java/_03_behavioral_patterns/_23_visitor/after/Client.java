package _03_behavioral_patterns._23_visitor.after;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device phone = new Phone();
        rectangle.accept(phone);
    }
}

/*
    방문자 패턴
    > 기존 코드를 변경하지 않고 새로운 기능을 추가하는 방법

    장점
    - 기존 코드를 변경하지 않고 새로운 코드를 추가할 수 있다.
    - 추가 기능을 한 곳에 모아둘 수 있다.

    단점
    - 복잡하다.
    - 새로운 Element를 추가하거나 제거할 때 모든 Visitor 코드를 변경해야 한다.
 */