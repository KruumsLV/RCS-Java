package rcs.tasks.foodDelivery.classes;

public abstract class Person {
    protected String name;
    protected String surname;
    protected String phoneNumber;

    public Person(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = name;
        this.phoneNumber = phoneNumber;
    }

    abstract void displayPerson();
}
