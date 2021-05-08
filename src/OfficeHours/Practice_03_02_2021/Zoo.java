package OfficeHours.Practice_03_02_2021;
/*
Make a class Zoo
make a main method

Create variables and give some values

    - For this one, pick which datatype you think is best for each variable
    - name, founded date, starting time, closing time, open on holidays, has aquarium section,
      number of big cats, number of hoofed animals, number of reptiles, number of birds,
      number of primates, number of employees, ticket cost for adults, ticket cost for under 13,
      park rules,
    - Make a brochure of the zoo's information
 */

public class Zoo {
    public static void main(String[] args) {

        String name = "Brookfield Zoo", foundDate = "March 3, 2021", startTime = "7:00 AM",
                closingTime = "5:00 PM";
        boolean isOpenOnHolidays = true, hasAquarium = false;
        int bigCats = 10, hoofedAnimals = 15, reptiles = 20, birds = 20, primates = 10, employees = 50;
        double ticketCostForAdult = 13.99, ticketCostForUnder13 = 9.99;
        String parkRules = "No eating or drinking outside of designated area\n" + "No flashphotography\nNo " +
                "feeding the animals\nNo Extensive perfumes";

        System.out.println("\t\tCome to " + name + "!");
        System.out.println("We were founded on " + foundDate);
        System.out.println("Our operating hours are from " + startTime + " to " + closingTime);
        System.out.println("We are open on holidays: " + isOpenOnHolidays);
        System.out.println("We have an Aquarium: " + hasAquarium);

        System.out.println("\n\t\tFEATURED ANIMALS:");
        System.out.println("Number of Big Cats: " + bigCats);
        System.out.println("Number of Hoofed Animals: " + hoofedAnimals);
        System.out.println("Number of Reptiles: " + reptiles);
        System.out.println("Number of Birds: " + birds);
        System.out.println("Number of Primates: " + primates);
        System.out.println("\nAll of our animals are taken care of by our " + employees + " dedicated Employees");
        System.out.println("\n\t\tOUR PRICES:");
        System.out.println("Price for adults: $" + ticketCostForAdult);
        System.out.println("Price for anyone under 13: $" + ticketCostForUnder13);
        System.out.println("\n\t\tOUT RULES:\n" + parkRules);

    }

}
