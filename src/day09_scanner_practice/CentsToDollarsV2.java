package day09_scanner_practice;
import java.util.Scanner;

public class CentsToDollarsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Converting Cents into Dollar Amount and Cents");
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;

        System.out.println("Dollar amount: " + dollars);
        System.out.println("Remaining Cents: " + remainingCents);
    }
}
