package _01_creational_patterns._03_abstract_factory.before;


import _01_creational_patterns._02_factory_method.after.Ship;
import _01_creational_patterns._02_factory_method.after.ShipFactory;
import _01_creational_patterns._02_factory_method.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
