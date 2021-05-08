package OfficeHours.Practice_03_23_2021;
import java.util.Scanner;

public class NestedWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if(num >0) {
            //pos
            System.out.println("enter a single word");
            String word = input.next();

            if(word.length() % 2 == 0) {
                System.out.println(word + " is even length");

            } else {
                System.out.println(word + " is odd length");
            }

        } else {
            //neg
            System.out.println("Enter a character");
            char letter = input.next().charAt(0);



        }
    }
}
