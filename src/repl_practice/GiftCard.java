package repl_practice;
import java.util.*;

public class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        String gift = scan.next();

        int balance = 100;



        if (gift.equals("Blanket")) {
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + (balance - 60) + "$");

        } else if (gift.equals("Charger")) {
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + (balance - 25) + "$");
        } else if (gift.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 25) + "$");
        } else if (gift.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 30) + "$");
        } else if (gift.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (gift.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 50) + "$");
        } else if (gift.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 40) + "$");
        } else if (gift.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (gift.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 5) + "$");
        } else if (gift.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - 10) + "$");
        } else {
            System.out.println("Invalid item!");
        }




    }
}