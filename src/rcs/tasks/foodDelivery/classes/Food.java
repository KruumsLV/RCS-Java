package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.enums.FoodType;

public class Food {
    private String name;
    private double price;
    private FoodType foodType;
    private boolean isAvailable;

    public Food(String name, double price, FoodType foodType) {
        this.name = name;
        this.price = price;
        this.foodType = foodType;
        this.isAvailable = true;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setAvailable(boolean availability) {
        this.isAvailable = availability;
    }
}
