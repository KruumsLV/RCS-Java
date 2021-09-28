package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.interfaces.IVehicle;

public class Scooter implements IVehicle {

    private static final String name = "Scooter";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showIcon() {
        System.out.println("Scooter icon.");
    }
}
