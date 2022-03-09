package factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "Whiteship", "keesun@mail.com");
        client.print(new BlackShipFactory(), "Blackship", "keesun@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}

/*

    * 팩토리 메소드 패턴을 적용했을 때의 장점과 단점.
    1. 장점 : OCP 원칙을 따를 수 있다.(기존 코드를 수정할 필요가 없다.)
        Creator와 Product간의 관계를 느슨하게 가져감. => rosed coupling
    2. 단점 : 클래스가 많아짐.

    * OCP 원칙에서 확장에 열려있고 변경에 닫혀 있다는 말이 구체적으로?
    변경에 닫혀 있다 -> 기존 코드를 변경하지 않는다.
    확장에 열려있다 -> 새로운 기능을 얼마든지 확장할 수 있다.

    * default 메소드 -> 인터페이스에 기본적인 구현체를 만들 수 있음. 자바 8 이전에는 인터페이스는 추상 메소드만 정의가 가능했다.

    * 팩토리 메소드 패턴 정의.
    - 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
    - 다양한 구현체(Product)가 있고, 그중에서 특정한 구현체를 만들 수 있는 다양한 팩토리(Creator)를 제공할 수 있다.

 */