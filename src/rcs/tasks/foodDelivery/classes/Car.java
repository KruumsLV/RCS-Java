package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.interfaces.IVehicle;

public class Car implements IVehicle {

    private static final String name = "Car";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showIcon() {
        System.out.println("Car icon.");
    }
}
