package practice_by_Saim;
import java.util.Scanner;
/*
• Write a program that can calculate the sum of all the even numbers between 1 ~ 100
• Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
• Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
• Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
 */

public class LoopsPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                count += i;
            }
        }
        System.out.println("The sum of Even numbers: " + count);

        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("The sum of Odd numbers: " + sum);


        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 1) {
                if(i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                if(i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }


    }
}
