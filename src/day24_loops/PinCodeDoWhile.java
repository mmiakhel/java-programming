package day24_loops;
import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPincode = 1234;
        int pinCode = 0; //has to be declared here so that it's visible for while condition

        do {
            System.out.println("Enter pincode:");
            pinCode = scan.nextInt();
        } while (pinCode != secretPincode);

        System.out.println("Welcome to your account");
    }

}
