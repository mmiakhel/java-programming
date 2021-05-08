package day24_loops;
import java.util.*;
/*
-add a counter for attempts, maximum 5 attempts
 */

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
       // System.out.println(randomNum.nextInt(101));
        int secretNum = randomNum.nextInt(101);
        int guessingNum = 0;
        do{
            System.out.println("Guess the secret number:");
            guessingNum = scan.nextInt();
            if(guessingNum > secretNum) {
                System.out.println("Wrong, your number is too large");
            } else if (guessingNum < secretNum) {
                System.out.println("Wrong, your number is too small");
            }
        } while (secretNum != guessingNum);

        System.out.println("Congratulations! Your secret number is: " + secretNum);


//        Scanner scan = new Scanner(System.in);
//        int secretNum = 67;
//        int guessingNum = 0;
//
//        do {
//            System.out.println("Guess the secret number:");
//            secretNum = scan.nextInt();
//            if(guessingNum > secretNum) {
//                System.out.println("Wrong, your number is too large");
//            } else if(guessingNum < secretNum) {
//                System.out.println("Wrong, your number is too small");
//            }
//
//        } while (secretNum != guessingNum);
//        System.out.println("Congratulations, you won! Secret number: " + secretNum);

    }
}
