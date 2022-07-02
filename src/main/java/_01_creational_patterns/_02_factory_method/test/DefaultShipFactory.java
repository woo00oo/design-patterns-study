package _01_creational_patterns._02_factory_method.test;

import _01_creational_patterns._02_factory_method.after.Ship;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public Ship orderShip(String name, String email) {
        validate(name, email);
        Ship ship = createShip();
        sendEmail(email);
        return ship;
    }

    private void validate(String name, String email){

    }

    private void sendEmail(String email){}
}
