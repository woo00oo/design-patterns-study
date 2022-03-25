package _03_behavioral_patterns._19_observer.after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("keesun");
        User user2 = new User("whiteship");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "오징어게임", "아..이름이 기억났어.. 일남이야...오일남");
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴으로 만든 채팅");
    }
}

/*
    옵저버 패턴
    > 다수의 객체가 특정 객체 상태 변화를 감지하고 알림을 받는 패턴.

    장점
    - 상태를 변경하는 객체(publisher)와 변경을 감지하는 객체(subscriber)의 관계를 느슨하게 유지할 수 있다.
    - Subject의 상태 변경을 주기적으로 조회하지 않고 자동으로 감지할 수 있다.
    - 런타임에 옵저버를 추가하거나 제거할 수 있다.

    단점
    - 복잡도가 증가한다.
    - 다수의 Observer 객체를 등록 이후 해지 않는다면 memory leak이 발생할 수도 있다.
 */