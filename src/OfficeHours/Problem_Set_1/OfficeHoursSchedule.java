package OfficeHours.Problem_Set_1;
import java.util.Scanner;
/*
---------------------------------------------------------- [Office Hours Schedule]
Given some Day(String) print out the office hours schedule for that day if there is office hours.
Monday, Tuesday, Wednesday:
Print: Office hours at 5:30 - 6:45 EST
Thursday:
Print: Soft Skills day
Friday:
Print: Day off
Saturday, Sunday:
Print: Already a long day, no office hours.
Any other String:
Print: Invalid day given
---------------------------------------------------------- [Grade level]
Given a grade level (byte) determine and print which school level someone is in.
1-5: Elementary school 6-8: Middle school 9-12: High school 13-16: College
17-18: Grad School
Other: Invalid grade level given
----------------------------------------------------------
========================================================== Challenge:
Make an updated calculator, make it as flexible as possible with everything we learned so far
==========================================================
 */

public class OfficeHoursSchedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Day:");
        String day = scan.next();
        switch(day){
            case "Monday":
                System.out.println("Office hours at 5:30 - 6:45 EST");
                break;
            case "Tuesday":
                System.out.println("Office hours at 5:30 - 6:45 EST");
                break;
            case "Wednesday":
                System.out.println("Office hours at 5:30 - 6:45 EST");
                break;
            case "Thursday":
                System.out.println("Sof Skills day");
                break;
            case "Friday":
                System.out.println("Day Off");
                break;
            case "Saturday":
                System.out.println("Already a long day, no office hours.");
                break;
            case "Sunday":
                System.out.println("Already a long day, no office hours.");
                break;
                default:
                System.out.println("Invalid day given");

        }


        System.out.println("Enter Grade Level:");
        byte grade = scan.nextByte();
        switch(grade){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Elementary School");
                break;
            case 6: case 7: case 8:
                System.out.println("Middle School");
                break;
            case 9: case 10: case 11: case 12:
                System.out.println("High School");
                break;
            case 13: case 14: case 15: case 16:
                System.out.println("College");
                break;
            case 17: case 18:
                System.out.println("Grad School");
                break;
            default:
                System.out.println("Invalid grade level given");
        }
    }
}
