package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.interfaces.IVehicle;

public class Bicycle implements IVehicle {

    private static final String name = "Bicycle";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showIcon() {
        System.out.println("Bicycle icon.");
    }
}
