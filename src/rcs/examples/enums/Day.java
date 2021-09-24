package rcs.examples.enums;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static Day getDayLV(String dayName) {
        switch (dayName.toUpperCase()) {
            case "PIRMDIENA":
                return MONDAY;
            case "OTRDIENA":
                return TUESDAY;
            case "TRESDIENA":
                return WEDNESDAY;
            case "CETURTDIENA":
                return THURSDAY;
            case "PIEKTDIENA":
                return FRIDAY;
            case "SESTDIENA":
                return SATURDAY;
            case "SVETDIENA":
                return SUNDAY;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

}
