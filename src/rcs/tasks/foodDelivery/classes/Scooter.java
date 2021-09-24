package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.interfaces.IVehicle;

public class Scooter implements IVehicle {

    @Override
    public void showIcon() {
        System.out.println("Scooter icon.");
    }
}
