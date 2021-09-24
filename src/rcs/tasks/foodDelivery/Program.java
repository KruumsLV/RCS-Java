package rcs.tasks.foodDelivery;

import rcs.tasks.foodDelivery.classes.Car;
import rcs.tasks.foodDelivery.classes.Courier;
import rcs.tasks.foodDelivery.classes.Customer;
import rcs.tasks.foodDelivery.classes.Person;
import rcs.tasks.foodDelivery.interfaces.IVehicle;

public class Program {

    public static void main(String[] args) {
        Person customer = new Customer("Kristaps",
                "Krumins", "1512521", "kruums",
                "01-01-2021");
        IVehicle courierVehicle = new Car();
        Person courier = new Courier("Janis", "Surname", "1412421",
                courierVehicle);
    }
}
