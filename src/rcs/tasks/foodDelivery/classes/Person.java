package rcs.tasks.foodDelivery.classes;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
    protected String name;
    protected String surname;
    protected String phoneNumber;
    protected LocalDate birthDate; // can be null

    public Person(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @param name
     * @param surname
     * @param phoneNumber
     * @param birthDate Date in format YYYY-MM-DD
     */
    public Person(String name, String surname, String phoneNumber, String birthDate) {
        this(name, surname, phoneNumber);
        this.birthDate = LocalDate.parse(birthDate);
    }

    public abstract void displayPerson();

    public short getAge() {
        if (this.birthDate == null) {
            return 0;
        }
        LocalDate todayDate = LocalDate.now();
        Period periodBetween = Period.between(this.birthDate, todayDate);
        return (short)periodBetween.getYears();
    }
}
