package repl_practice;

import java.util.Scanner;

/*
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:
"Enter seconds:"
Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
Assign values to the hours, minutes, seconds variables
Display the result.
Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */

public class SecondsConverter {
    public static void main(String[] args) {

        int inputSeconds, hours, minutes, seconds;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds");
        inputSeconds = scan.nextInt(); //3695

        /*
        how many seconds are in an hour?
        60 sec = 1 min
        60 min = 1 hour
        60 * 60 = 3600
         */

        hours = inputSeconds / 3600; // 3695/3600 = 1
        //inputSeconds = inputSeconds % 3600; // 95 seconds left  //commented out cuz we use shorthand below
        inputSeconds %= 3600;
        minutes  = inputSeconds / 60; //95/60 = 1
        inputSeconds %= 60; //35 seconds
        seconds = inputSeconds;
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");



    }
}
