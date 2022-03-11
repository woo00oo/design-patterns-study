package _01_creational_patterns._03_abstract_factory.after;

import _01_creational_patterns._02_factory_method.after.Ship;
import _01_creational_patterns._02_factory_method.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass() );
    }
}

/*

    추상 팩토리 패턴 vs 팩토리 메소드 패턴
    
    > 둘 다 구체적인 객체 생성 과정을 추상화한 인터페이스를 제공한다.
    
    - 관점이 다르다.
      - 팩토리 메소드 패턴은 "팩토리를 구현하는 방법(inheritance)"에 초점을 둔다.
      - 추상 팩토리 패턴은 "팩토리를 사용하는 방법(composition)"에 초점을 둔다.

    - 목적이 조금 다르다.
      - 팩토리 메소드 패턴은 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적.
      - 추상 팩토리 패턴은 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적.

 */