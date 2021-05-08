package OfficeHours.Problem_Set_1;
import java.util.Scanner;
    /*
Variables, Datatypes, Print statement, Concatenation, Scanner ======
[Personal Information - Scanner and If]
Ask the user how many people they live with?
if user lives with Less than 2 people: print "Live with less than 2 people"
if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
if the user lives with more than 6 people: print "Live with "more than 6 people"
Ask the user what city they live in?
Ask the user if the live in downtown ("yes or no")
if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
if they have thought about it print "do it its great", if they have not print "You should think about it"
Ask the user their favorite animal?
Print "Wow %animal is a great animal"
Ask the user how many pets they want?
Print "Interesting, do you want %numberOfPets %favoriteAnimals?"
----------------------------------------------------------
         */
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int howManyPpl = 0;
        System.out.println("How many people do you live with?");
        howManyPpl = scan.nextInt();
        if(howManyPpl < 2) {
            System.out.println("Live with less than 2 people");
        } else if (howManyPpl >= 3 && howManyPpl <= 6) {
            System.out.println("Live with 3-6 people");
        } else {
            System.out.println("Live with more than 6 people\n");
        }

        String city = "";
        boolean isDownTown = true;
        boolean isSuburbs = true;
        System.out.println("What city do you live in?");
        city = scan.next();
        System.out.println("Do you live in downtown?");
        isDownTown = scan.nextBoolean();
        if(isDownTown == true) {
            System.out.println("Have you thought about moving to the suburbs?");
            isSuburbs = scan.nextBoolean();
            if(isSuburbs == true) {
                System.out.println("Do it, it's great!");
            } else {
                System.out.println("You should think about it!\n");
            }
        }
        String favAnimal = "";
        int pets = 0;
        System.out.println("What is your favorite animal?");
        favAnimal = scan.next();
        System.out.println("Wow, " + favAnimal + " is a great animal!");
        System.out.println("How many pets do you want?");
        pets = scan.nextInt();
        System.out.println("Interesting, do you want " + pets + " " + favAnimal + "?");



    }
}
