package creationalpatterns.abstractfactory.after;


import creationalpatterns.abstractfactory.before.WhiteAnchor;
import creationalpatterns.abstractfactory.before.WhiteWheel;
import creationalpatterns.factorymethod.after.Ship;
import creationalpatterns.factorymethod.after.ShipFactory;
import creationalpatterns.factorymethod.after.WhiteShip;

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
