package _01_creational_patterns._02_factory_method.before;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

}
/*

    해당 애플리케이션은 OCP(개방 폐쇄 원칙)에 만족하지 않음.
    새로운 기능이 추가될 때 마다, ShipFactory 클래스에 변경이 생김.

 */
