package OfficeHours.Practice_03_10_2021;
import java.util.Scanner;

public class MovieDuration2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the movie:");
        double movieLength = input.nextDouble();
        double price = 0;

        if (movieLength == 1.0) {
            price = 8.99;
        }
        if (movieLength == 1.5) {
            price = 10.50;
        }
        if (movieLength == 2.0) {
            price = 12.99;
        }
        if (movieLength == 2.5) {
            price = 4.50;
        }
        if (movieLength >= 3.0) {
            price = 15.99;
        }
        if (movieLength <= 0.0){
            System.out.println("Invalid length");
        } else {
            System.out.println("Price: " + price);
        }
    }
}
