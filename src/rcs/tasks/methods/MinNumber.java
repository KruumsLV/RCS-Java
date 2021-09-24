package rcs.tasks.methods;

public class MinNumber {

    public static int minValue(int[] array) {
        if (array.length == 0) return 0;

        int minValue = array[0];
        for(int i = 1; i < array.length; i++) {
            //minValue = array[i] < minValue ? array[i] : minValue;
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        // 1. uzrakstīt metodi minValue,
        // kas kā parametru saņem veselo skaitļu masīvu
        // un metode rezultāta atgriež šī masīva mazāko vērtību

        // 2. Izveidot veselo skaitļu masīvu un
        // izsaukt metodi minValue
        int[] numArray = { };
        System.out.println(minValue(numArray));
    }
}
