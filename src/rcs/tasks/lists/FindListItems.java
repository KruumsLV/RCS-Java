package rcs.tasks.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import rcs.examples.Example;

public class FindListItems {
    public static void main(String[] args) {
        // 1. Pieprasīt lietotājam izvēlēties saraksta izmēru
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadiet saraksta izmēru: ");
        while(!scanner.hasNextInt()) {
            System.out.print("Ievadiet saraksta izmēru: ");
            scanner.nextLine();
        }
        int listSize = scanner.nextInt();
        scanner.nextLine();
        // 2. Izveidot sarakstu ar String elementiem.
        List<String>  textList = new ArrayList<>();
        // 3. Lietotājs ievada tekstu n reizes, aizpildot visu sarakstu
        //    kur n ir saraksta izmērs
        // Ja listSize = 5
        for(int i = 1; i <= listSize; i++) {
            System.out.print("Ievadiet tekstu nr. " + i + ": ");
            String text = scanner.nextLine();
            textList.add(text);
        }
        // 4. Pierasīt no lietotāja ievadīt meklējamo tekstu
        System.out.print("Ievadiet meklējamo tekstu: ");
        String searchText = scanner.nextLine();
        scanner.close();

        // 5. Atrast un izvadīt visus tos saraksta elementus,
        // kuros teksts sākās ar lietotāja ievadīto meklējamo tekstu
        // Search for those elements that start with the entered text
        // case insensitive
        // [ "ABC", "Kristaps, "asfnojasfoas", "ABEGA"] abc
        // Lietotājs meklē "ab" , tad tiek izvadīti:
        // ABC ABEGA
        // for(type variable : collection) { }
        for(String text : textList) {
            if (text.toLowerCase().startsWith(searchText.toLowerCase())) {
                System.out.println(text);
            }
        }
    }
}
