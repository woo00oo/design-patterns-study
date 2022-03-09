package creationalpatterns.abstractfactory.after;

import creationalpatterns.abstractfactory.before.WhiteAnchor;
import creationalpatterns.abstractfactory.before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
