package rcs.tasks.methods;

import rcs.examples.classes.*;

public class Recursion {
    // Factorial
    // 6! = 6*5*4*3*2*1 = 720
    // 5! = 5*4*3*2*1 = 120
    public static int factorial(int x) {
        return x > 1 ? x * factorial(x - 1) : x;
    }

    public static void main(String[] args) {
        // 1. Izmantojot rekursiju,
        // uzrakstīt metodi factorial,
        // kas kā parametru saņem veselo skaitli
        // un atgriež tās faktoriālo vērtību.

        // 2. Izsaukt metodi factorial ar kādu vertību
        System.out.println(factorial(4));
    }
}
