package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25.00){
            System.out.println("Free shipping eligible.\nYour order total: $" + totalPrice);
        } else {
            System.out.println("Not eligible for free shipping.\nYour order total: $"
                    + totalPrice + ". less than minimum of $25.00\n");
        }
        System.out.println("THANK YOU FOR SHOPPING AT AMAZON!");


    }
}
