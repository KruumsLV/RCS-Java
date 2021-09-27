package rcs.tasks.foodDelivery.classes;

import java.time.LocalDate;

public class Customer extends Person {

    private String username;
    private LocalDate registrationDate;

    /**
     *
     * @param name
     * @param surname
     * @param phoneNumber
     * @param username
     * @param registrationDate Date in format YYYY-MM-DD
     */
    public Customer(String name, String surname, String phoneNumber, String username,
                    String registrationDate){
        super(name, surname, phoneNumber);
        this.username = username;
        this.registrationDate = LocalDate.parse(registrationDate);
    }

    public Customer(String name, String surname, String phoneNumber, String username,
                    String registrationDate, String birthDate){
        super(name, surname, phoneNumber, birthDate);
        this.username = username;
        this.registrationDate = LocalDate.parse(registrationDate);
    }

    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPersonInfo() {
        return "";
        // Klients: {name} {surname}, Lietotājvārds: {username}, Reģ. dat.: {registrationDate}, Vecums: {getAge()}
        // NOTE: Vecums nav, ja nav birthDate (ja tas ir null)

    }
}
