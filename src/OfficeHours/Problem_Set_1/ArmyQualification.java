package OfficeHours.Problem_Set_1;
import java.util.Scanner;
/*
 [Qualification For Army]
Given information: Citizenship(String), resident (boolean), and has high school diploma (boolean), and age(int).
Determine if the person is qualified to join the army.
- The person must be a Citizen of the USA or a resident
-> If not print: You must be a U.S. citizen or a resident
- Their age must be between 18 and 35
-> If not print: Your age must be between 18 to 35 years old
- They must have a high school diploma
-> If not print: You must have a high school diploma
> If all the criteria is met print: You are qualified for the US Army
 */

public class ArmyQualification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String citizenship = "";
        boolean isResident = true;
        boolean hasDiploma =  true;
        int age = 0;
        System.out.println("Are you a citizen?");
        citizenship = scan.next();
        System.out.println("Are you a resident?");
        isResident = scan.nextBoolean();
        if(citizenship.equalsIgnoreCase("yes") || isResident == true) {
            System.out.println("How old are you?");
            age = scan.nextInt();
            if(age >= 18 && age <= 35) {
                System.out.println("Do you have a high school diploma?");
                hasDiploma = scan.nextBoolean();
            }
            else {
                System.out.println("Your age must be between 18 and 35 years old");
            }

        } else {
            System.out.println("You must be a U.S. citizen or a resident to qualify.");

        }

    }
}
