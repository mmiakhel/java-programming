package OfficeHours.Practice_04_06_2021;
import java.util.Random;
/*
Generate a random number that is six digits long. Each digit in this number should be unique,
 meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.
HINTS: Loops, Strings, Random
 */

public class RandomSixDigitNumber {
    public static void main(String[] args) {
        Random random = new Random();
        String randomNumber = "";

        while(randomNumber.length() != 6) {
            int eachRandom = random.nextInt(10); //gives random number from 0 to 9 (10 or last number is not included)
            //int eachRandom = random.nextInt(9) + 1; // 1-9 (how to modify range if needed

            if(!randomNumber.contains("" + eachRandom)) {
                randomNumber += eachRandom;
            }

        }
        System.out.println("Random Number: " + randomNumber);





    }
}
