package _01_creational_patterns._02_factory_method.after;

public class WhiteShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
