package rcs.tasks.foodDelivery;

import rcs.tasks.foodDelivery.classes.*;
import rcs.tasks.foodDelivery.enums.FoodType;
import rcs.tasks.foodDelivery.enums.OrderStatus;
import rcs.tasks.foodDelivery.enums.PaymentStatus;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        // JAR file
        // Java Archive
        // Can be Executable / Non-Executable
        // Executable - ir norāde uz main metodi, līdz ar to
        // var palaist kā programmu
        // Non-Executable - satur tikai klašu bibliotēku (library)

        Person customer = new Customer("Kristaps",
                "Krumins", "1512521", "kruums",
                "2021-01-01");
        Person courier = new Courier("Janis", "Surname", "1412421",
                new Car(), "1990-04-22");

        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("Kartupeļi Frī", 2.50, FoodType.MAIN));
        foodList.add(new Food("Pepsi", 1, FoodType.DRINK));
        foodList.add(new Food("Vistas karbonāde", 2, FoodType.MAIN));

        Order order1 = new Order((Customer)customer, (Courier)courier,
                foodList, "Mana adrese 1", PaymentStatus.IN_CASH);
        order1.changeStatus(OrderStatus.SEEN);
        order1.changeStatus(OrderStatus.PREPARING);
        order1.changeStatus(OrderStatus.DELIVERING);
        order1.setPaymentStatus(PaymentStatus.PAYED);
        if (!order1.changeStatus(OrderStatus.DELIVERED)) {
            order1.changeStatus(OrderStatus.CANCELLED);
        }
        System.out.println(order1);

        Person customer2 = new Customer("ASDasd",
                "fasfa", "421", "asfsa",
                "2021-01-04");
        Person courier2 = new Courier("sadsa", "asfsa", "421",
                new Scooter(), "1988-02-22");
        List<Food> foodList2 = new ArrayList<>();
        foodList2.add(new Food("Kartupeļi Frī", 2.50, FoodType.MAIN));
        foodList2.add(new Food("Pepsi", 1, FoodType.DRINK));
        foodList2.add(new Food("Kartupeļi Frī", 2.50, FoodType.MAIN));
        foodList2.add(new Food("asdsadsa", 2.50, FoodType.DESSERT));
        Order order2 = new Order((Customer)customer2, (Courier)courier2,
                foodList2, "ADrese 2", PaymentStatus.CREDIT);
        System.out.println(order2);
    }
}
