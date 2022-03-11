package _01_creational_patterns._03_abstract_factory.after;

import _01_creational_patterns._03_abstract_factory.before.WhiteAnchor;
import _01_creational_patterns._03_abstract_factory.before.WhiteWheel;

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
