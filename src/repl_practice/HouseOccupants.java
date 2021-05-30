package repl_practice;
import java.util.Scanner;

public class HouseOccupants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your house type:");
        String houseType = scan.nextLine();
        int maxOccupants = 0;
        switch(houseType) {
            case "Tree House":
                maxOccupants = 1;
                break;
            case "Mobile Home":
                maxOccupants = 2;
                break;
            case "Apartment":
                maxOccupants = 4;
                break;
            case "Town House":
                maxOccupants = 6;
                break;
            case "Villa":
                maxOccupants = 8;
                break;
            case "Mansion":
                maxOccupants = 10;
                break;
        }
        System.out.println("Max Occupants:\t" + maxOccupants);


        /*
        ========================================================== Switch ==================================

[House Occupants]
Given a house type (String) print out the number of max occupants (int)
Tree house: 1 Mobile home: 2 Apartment: 4 Town house: 6 Villa: 8 Mansion: 10
-> Try to use variables instead of printing multiple times
         */


    }
}
