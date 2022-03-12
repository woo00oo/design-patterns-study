package _02_structural_patterns._07_bridge.after;

import _02_structural_patterns._07_bridge.before.Champion;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.sillQ();
        kda아리.skillR();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }

}

/*
    브릿지 패턴
    > 추상적인 것과 구체적인 것을 분리하여 연결하는 패턴

    장점
    - 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있다.
    - 추상적인 코드와 구체적인 코드를 분리하여 둘 수 있다.

    단점
    - 계층 구조가 늘어나 복잡도가 증가할 수 있다.
 */