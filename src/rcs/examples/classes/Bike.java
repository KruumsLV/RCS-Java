package rcs.examples.classes;

public class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting bike...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping bike...");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating bike...");
    }

    @Override
    public void show() {
        System.out.println("Bike showed!");
    }
}
