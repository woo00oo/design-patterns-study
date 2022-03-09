package creationalpatterns.abstractfactory.after;

import creationalpatterns.factorymethod.after.Ship;
import creationalpatterns.factorymethod.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass() );
    }
}
