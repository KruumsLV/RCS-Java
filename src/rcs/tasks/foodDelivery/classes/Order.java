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

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    // getPrice => aprēķina sūtijuma summu (food summa)

    // changeStatus(newStatus) => kas nomaina statusu
    // Ja sūtījuma maksājuma veids ir CREDIT,
    // tad neļaut nomainīt statusu tālāk par SEEN statusu. Var būt [CREATED, SEEN, CANCELLED]
    // Ja sūtījuma maksājuma veids ir IN_CASH,
    // tad neļaut nomainīt statusu tālāk par DELIVERING statusu. Nevar būt [DELIVERED]
    public void changeStatus(OrderStatus newStatus) {
        this.orderStatus = newStatus;
        // Ja nederīgs newStatus, tad
        // throw new IllegalArgumentException();
        // vai
        // System.out.println("Kļūdas ziņojums");
    }

    // printStatus => izvada statusu saprotamā valodā

    @Override
    public String toString() {
        return "";
        // Informācija par klientu { customer.getPersonInfo() } \n
        // Informācija par kurjeru { courier.getPersonInfo() }
        // Ēdiens: {food1 name}, {food2 name}, ... utt.
        // Piegādes adrese: {deliveryAddress}
        // Sūtījuma statuss
        // Apmaksas veids/statuss
        // Sūtījuma datums un laiks
    }
}
