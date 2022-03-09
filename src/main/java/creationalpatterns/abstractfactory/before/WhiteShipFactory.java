package creationalpatterns.abstractfactory.before;


import creationalpatterns.factorymethod.after.Ship;
import creationalpatterns.factorymethod.after.ShipFactory;
import creationalpatterns.factorymethod.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
