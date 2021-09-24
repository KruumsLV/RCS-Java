package rcs.tasks.foodDelivery.classes;

public class Customer extends Person {

    private String username;
    private String registrationDate;

    public Customer(String name, String surname, String phoneNumber, String username,
                    String registrationDate){
        super(name, surname, phoneNumber);
        this.username = username;
        this.registrationDate = registrationDate;
    }

    @Override
    void displayPerson() {

    }
}
