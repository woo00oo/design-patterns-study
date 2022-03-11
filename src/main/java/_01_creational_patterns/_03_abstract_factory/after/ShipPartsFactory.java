package _01_creational_patterns._03_abstract_factory.after;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
