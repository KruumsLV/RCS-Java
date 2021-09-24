package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.interfaces.IVehicle;

public class Courier extends Person {

    private IVehicle vehicle;

    public Courier(String name, String surname, String phoneNumber, IVehicle vehicle) {
        super(name, surname, phoneNumber);
        this.vehicle = vehicle;
    }

    @Override
    void displayPerson() {

    }
}
