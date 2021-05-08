package OfficeHours.Problem_Set_1;
import java.util.Scanner;
/*
[Morning or Night]
Given some time value (int) in 24 hours format. Print if its the morning or night.
0 - 11 : Morning 12- 24 : Night
-> You can assume the value given is always valid (in the 24 hours range), but if you want a
challenge use an if to control invalid values

 */

public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time:");
        int time = scan.nextInt();
        String morningOrNight = (time >= 0 && time <= 11) ? "Morning" : "Night";
        System.out.println(time + " is " + morningOrNight);

    }
}
