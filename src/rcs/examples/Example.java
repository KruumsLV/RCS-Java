package rcs.examples;

import rcs.examples.classes.*;
import rcs.examples.interfaces.IVehicle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void outputVehicles(List<IVehicle> vehicleList) {
        for(IVehicle vehicle : vehicleList) {
            vehicle.start();
            vehicle.accelerate();
            vehicle.stop();
            vehicle.show();
        }
    }

    public static void main(String[] args) {

        // Java abstraction
        // 2 ways:
        // Interfaces - 100% abstraction
        // abstract class - 0-100%

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapes2 = new LinkedList<>();


        shapes.add(new Rectangle(3, 4));
        shapes.add(new Circle(3));
        for(Shape shape : shapes) {
            shape.show();
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
        }

    }
}
