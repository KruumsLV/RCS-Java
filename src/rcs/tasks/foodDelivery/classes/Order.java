package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.enums.OrderStatus;
import rcs.tasks.foodDelivery.enums.PaymentStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Customer customer;
    private Courier courier;
    private List<Food> foodList;
    private String deliveryAddress;
    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus;
    private LocalDateTime orderTime;

    public Order(Customer customer, Courier courier, List<Food> foodList,
                 String deliveryAddress, PaymentStatus paymentStatus) {
        this.customer = customer;
        this.courier = courier;
        this.foodList = foodList;
        this.deliveryAddress = deliveryAddress;
        this.paymentStatus = paymentStatus;
        this.orderStatus = OrderStatus.CREATED;
        this.orderTime = LocalDateTime.now();
    }

    // getPrice => aprēķina sūtijuma summu (food summa)
    // changeStatus(newStatus) => kas nomaina statusu
    // printStatus => izvada statusu saprotamā valodā

}
