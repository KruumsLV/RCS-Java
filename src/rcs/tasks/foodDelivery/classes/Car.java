package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.interfaces.IVehicle;

public class Car implements IVehicle {

    @Override
    public void showIcon() {
        System.out.println("Car icon.");
    }
}
