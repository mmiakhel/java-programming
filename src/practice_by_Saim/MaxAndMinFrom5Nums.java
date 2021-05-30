package practice_by_Saim;
import java.util.Scanner;
/*
[Max and Min from 5 numbers]
• Write a program that can ask the user "enter a number" five times and return the maximum number
• Write a program that can ask the user "enter a number" five times and return the minimum number
 */
public class MaxAndMinFrom5Nums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int first = scan.nextInt();

        int max = first;
        int min = first;

        for(int i = 0; i < 4; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
        }
        System.out.println("Max number:\t" + max);
        System.out.println("Min number:\t" + min);




    }
}
