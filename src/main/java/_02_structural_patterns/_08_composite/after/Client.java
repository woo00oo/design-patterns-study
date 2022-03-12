package _02_structural_patterns._08_composite.after;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    // Component의 타입을 체크해야하는 경우 즉, 지나치게 일반화 했을 경우 디자인 패턴에 종속적으로 개발하고 있는 것은 아닌지 다시 한번 확인해 볼 필요가 있다.
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}

/*
    컴포짓 패턴
    > 그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴.

    장점
    - 복잡한 트리 구조를 편리하게 사용할 수 있다.
    - 다형성과 재귀를 활용할 수 있다.
    - 클라이언트 코드를 변경하지 않고 새로운 엘리먼트 타입을 추가할 수 있다.(OCP)

    단점
    - 트리를 만들어야 하기 때문에 (공통된 인터페이스를 정의해야 하기 때문에) 지나치게 일반화 해야하는 경우도 생길 수 있다.
    -
 */