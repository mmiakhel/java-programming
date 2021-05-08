package OfficeHours.Practice_03_30_2021;
import java.util.Scanner;

public class DynamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = input.next();
        System.out.println("Do you want it in ascending or descending order");
        String ascendingOrDescending = input.next();
        int starting = 0;
        int ending = 0;

        if(upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';

        } else {
            starting = 'a';
            ending = 'z';

        }


        if(ascendingOrDescending.equals("ascending")) {
            for(int i=starting; i <= ending; i+=2) {
                System.out.print((char)i + " ");
            }
        } else {
            for(int i=ending; i >= starting; i+=2) {
                System.out.print((char)i + " ");
            }
        }

    }
}
