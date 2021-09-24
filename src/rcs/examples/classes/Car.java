package rcs.examples.classes;

import rcs.examples.interfaces.IVehicle;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car...");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating car...");
    }

    @Override
    public void show() {
        System.out.println("Car showed!");
    }
}
