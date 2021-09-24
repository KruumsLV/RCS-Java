package rcs.examples.classes;

public class Person {
    public String name;
    public String surname;
    public String phoneNumber;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, String phoneNumber) {
        this(name, surname);
        this.phoneNumber = phoneNumber;
    }

    public void show() {
        System.out.println(String.format("Hello from %s %s", name, surname));
    }
}
