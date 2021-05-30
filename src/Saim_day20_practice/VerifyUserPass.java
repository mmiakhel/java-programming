package Saim_day20_practice;
import java.util.Scanner;
/*
Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
            -> Also change the password to have the value: "password"
 */

public class VerifyUserPass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scan.next();
        System.out.println("Enter password");
        String password = scan.next();

        if(password.length() <5) {
            System.out.println("Password cannot be less than 5 characters");
        } else if (password.length() >= 5 && !password.equals(username)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid password, username should not be in it");
            password = "password";
        }


    }
}
