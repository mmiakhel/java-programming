package repl_practice;
import java.util.Scanner;

public class Property {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        int priceH = 0;
        int bedPrice = 0;
        int yardPrice = 0;
        int spotPrice = 0;
        int metroPrice = 0;
        int highPrice = 0;
        int schoolPrice = 0;
        int smokePrice = 0;

        System.out.println("Enter your property type:");
        houseType = scan.next();
        if (houseType.equals("Condo")) {
            priceH += 50000;
        } else if (houseType.equals("Townhouse")) {
            priceH += 75000;
        } else if (houseType.equals("Single")) {
            priceH += 95000;
        }


        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        bedPrice = numberOfBedrooms * 30000;

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if (backyard && !houseType.equals("Condo")) {
            yardPrice = 5000;
        } else if (backyard && houseType.equals("Condo")) {
            System.out.println("Backyard is not available for condo!");
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();

        System.out.println("How many spots?");
        garageSpots = scan.nextInt();
        if (garage && garageSpots < 10) {
            spotPrice = garageSpots * 20000;
        } else if (garage && garageSpots > 10) {
            System.out.println("Pardon, it's not a public parking!");
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if (metroAccessibility <= 1.0 ) {
            metroPrice += 10000;
        } else {
            metroPrice += 5000;
        }

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility <= 1.0 ) {
            highPrice += 15000;
        } else if (highwayAccessibility > 1 && highwayAccessibility < 5) {
            highPrice += 8000;
        } else {
            highPrice += 4000;
        }

        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if (schoolScore <= 10 && schoolScore >= 8) {
            schoolPrice += 45000;
        } else if (schoolScore < 8 && schoolScore >= 4) {
            schoolPrice += 20000;
        } else {
            schoolPrice += 5000;
        }

        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        if (smoking) {
            smokePrice -= 5000;
        }

        propertyPrice = priceH + bedPrice + yardPrice + spotPrice +
                metroPrice + highPrice + schoolPrice + smokePrice;

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");


        /*
int priceC = 0;
        int priceT = 0;
        int priceS = 0;
        int bedPrice = 0;
        int yardPrice = 0;
        int spotPrice = 0;
        int metroPrice = 0;
        int highPrice = 0;
        int schoolPrice = 0;
        int smokePrice = 0;         */



    }

}
