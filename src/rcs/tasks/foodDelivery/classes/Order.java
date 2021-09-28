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
    public double getPrice() {
        double sum = 0;
        for(Food food : foodList) {
            sum += food.getPrice();
        }
        return sum;
    }

    // changeStatus(newStatus) => kas nomaina statusu
    // Ja sūtījuma maksājuma veids ir CREDIT,
    // tad neļaut nomainīt statusu tālāk par SEEN statusu. Var būt [CREATED, SEEN, CANCELLED]
    // Ja sūtījuma maksājuma veids ir IN_CASH,
    // tad neļaut nomainīt statusu tālāk par DELIVERING statusu. Nevar būt [DELIVERED]
    public boolean changeStatus(OrderStatus newStatus) {
        switch(paymentStatus) {
            case CREDIT:
                if (!(newStatus == OrderStatus.CREATED && newStatus == OrderStatus.SEEN
                    && newStatus == OrderStatus.CANCELLED)) {
                    System.out.println("Nav veikta apmaksa!");
                    return false;
                }
            case IN_CASH:
                if (newStatus == OrderStatus.DELIVERED) {
                    System.out.println("Nav veikta apmaksa!");
                    return false;
                }
            default:
                break;
        }
        this.orderStatus = newStatus;
        return true;
    }

    public String getFoodListString() {
        String foods = "";
        int i = 1;
        for(Food food : foodList) {
            foods += food.getName() + (i++ < foodList.size() ? ", " : "");
            //i++;
        }
        return foods;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n" +
                "Ēdiens: %s\n" +
                "Piegādes adrese: %s\n" +
                "Cena: %.2f\n" +
                "Sūtījuma statuss: %s\n" +
                "Apmaksas veids: %s\n" +
                "Sūtijuma laiks: %s",
                customer.getPersonInfo(),
                courier.getPersonInfo(),
                getFoodListString(),
                deliveryAddress,
                getPrice(),
                orderStatus,
                paymentStatus,
                orderTime
                );
    }
}
