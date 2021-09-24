package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.enums.OrderStatus;
import rcs.tasks.foodDelivery.enums.PaymentStatus;

import java.util.List;

public class Order {
    private Customer customer;
    private Courier courier;
    private List<Food> foodList;
    private String deliveryAddress;
    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus;

}
