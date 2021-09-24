package rcs.examples.classes;

import rcs.examples.interfaces.IVehicle;

public class Boat extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting boat...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping boat...");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating boat...");
    }

    @Override
    public void show() {
        System.out.println("Boat showed!");
    }
}
