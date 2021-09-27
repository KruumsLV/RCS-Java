package rcs.tasks.foodDelivery;

import rcs.tasks.foodDelivery.classes.*;
import rcs.tasks.foodDelivery.enums.FoodType;
import rcs.tasks.foodDelivery.enums.OrderStatus;
import rcs.tasks.foodDelivery.enums.PaymentStatus;
import rcs.tasks.foodDelivery.interfaces.IVehicle;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Person customer = new Customer("Kristaps",
                "Krumins", "1512521", "kruums",
                "2021-01-01");
        IVehicle courierVehicle = new Car();
        Person courier = new Courier("Janis", "Surname", "1412421",
                courierVehicle, "1990-04-22");

        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("Kartupeļi Frī", 2.50, FoodType.MAIN));
        foodList.add(new Food("Pepsi", 1, FoodType.DRINK));
        foodList.add(new Food("Vistas karbonāde", 2, FoodType.MAIN));

        Order order1 = new Order((Customer)customer, (Courier)courier,
                foodList, "Mana adrese 1", PaymentStatus.CREDIT);
        order1.setPaymentStatus(PaymentStatus.PAYED);
        order1.changeStatus(OrderStatus.DELIVERED);
        System.out.println(order1);
    }
}
