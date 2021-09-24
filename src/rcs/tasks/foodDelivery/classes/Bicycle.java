package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.interfaces.IVehicle;

public class Bicycle implements IVehicle {

    @Override
    public void showIcon() {
        System.out.println("Bicycle icon.");
    }
}
