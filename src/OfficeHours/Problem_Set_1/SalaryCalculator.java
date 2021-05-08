package OfficeHours.Problem_Set_1;
import java.util.Scanner;
/*
---------------------------------------------------------- [Salary Calculator]
Given the following information: hourly rate, weekly hours, and number of weeks.
Check if all the inputs are valid and then calculate the salary.

- hourly rate cannot be negative or zero
-> If invalid print: Hourly Rate cannot be Negative or Zero

- weekly hours cannot be zero, negative or more than 65
-> If invalid print: Weekly Hours cannot be less than 1 or greater than 65

- number of weeks cannot be less than 1 and more than 52
-> If invalid print: Number of weeks cannot be less than 1 or greater than 52
Equation: salary = hourly rate * weekly hours * number of weeks
----------------------------------------------------------
 */

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hourlyRate = 0;
        int weeklyHours = 0;
        int numWeeks = 0;

        System.out.println("Enter your hourly rate:");
        hourlyRate = scan.nextInt();
        if(hourlyRate > 0 ) {
            System.out.println("Enter your weekly hours:");
            weeklyHours = scan.nextInt();
            if(weeklyHours > 0 && weeklyHours <= 65) {
                System.out.println("Enter the number of weeks:");
                numWeeks = scan.nextInt();
                if(numWeeks >= 1 && numWeeks <= 52) {
                    int salary = hourlyRate * weeklyHours * numWeeks;
                    System.out.println("Your salary is:  $" + salary);
                } else {
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }
            } else {
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
            }
        } else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }

    }
}
