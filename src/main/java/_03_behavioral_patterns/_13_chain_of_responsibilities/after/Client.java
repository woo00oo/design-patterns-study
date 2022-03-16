package _03_behavioral_patterns._13_chain_of_responsibilities.after;

import _03_behavioral_patterns._13_chain_of_responsibilities.before.Request;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}

/*
    책임 연쇄 패턴
    > 요청을 보내는 쪽과 요청을 처리하는 쪽의 분리하는 패턴

    장점
    - 클라이언트 코드를 변경하지 않고 새로운 핸들러를 체인에 추가할 수 있다.
    - 각각의 체인은 자신이 해야하는 일만 한다.
    - 체인을 다양한 방법으로 구성할 수 있다.

    단점
    - 디버깅이 번거롭다.
 */