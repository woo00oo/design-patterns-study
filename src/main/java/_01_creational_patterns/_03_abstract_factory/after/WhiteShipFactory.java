package _01_creational_patterns._03_abstract_factory.after;


import _01_creational_patterns._02_factory_method.after.Ship;
import _01_creational_patterns._02_factory_method.after.ShipFactory;
import _01_creational_patterns._02_factory_method.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
