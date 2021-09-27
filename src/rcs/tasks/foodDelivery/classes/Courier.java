package rcs.tasks.foodDelivery.classes;

import rcs.tasks.foodDelivery.interfaces.IVehicle;

public class Courier extends Person {

    private IVehicle vehicle;

    public Courier(String name, String surname, String phoneNumber, IVehicle vehicle) {
        super(name, surname, phoneNumber);
        this.vehicle = vehicle;
    }

    /**
     *
     * @param name
     * @param surname
     * @param phoneNumber
     * @param vehicle
     * @param birthDate Date in format YYYY-MM-DD
     */
    public Courier(String name, String surname, String phoneNumber, IVehicle vehicle, String birthDate) {
        super(name, surname, phoneNumber, birthDate);
        this.vehicle = vehicle;
    }

    @Override
    public String getPersonInfo() {
        return "";
        // Kurjers: {name} {surname}, Vecums: {getAge()}, Transportlīdzeklis: {showIcon()}
        // NOTE: Vecums nav, ja nav birthDate (ja tas ir null)
    }
}
