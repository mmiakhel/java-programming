package OfficeHours.Practice_03_03_2021;

public class Apartment {
    public static void main(String[] args) {

        String address = "750 Zoo avenue, Herndon, Va 20170", owner = "Sam Hours",
                lengthOfLease = "12 months";
        int numOfUnits = 40, unitSize = 900, monthlyRent = 1900, numOfWashDry = 1,
        totalNumOfResidents = 200, numOfFloors = 20, numOfParkingSpaces = 120;
        long phoneNumOfOwner = 5712314567L;
        boolean hasPool = true, allowsPets = false, nearGasStation = true, hasBasement = false,
                hasUnitsForRent = true, hasAirConditioning = true, hasWheelChairAccess = true;
        double numOfReviewStars = 4.5;

        int monthlyRentAfter3Years = monthlyRent - (monthlyRent * 1/10);
        int monthlyRentAfter6Years = monthlyRent - (monthlyRent * 1/5);
        double aveNumOfResidentsPerUnit = totalNumOfResidents / numOfUnits;
        double aveNumOfParkingSpotsPerUnit = numOfParkingSpaces / numOfUnits;
        double aveNumOfUnitsPerFloor = numOfUnits / numOfFloors;

        System.out.println("**********Rental Application**********");
        System.out.println("Address:\t\t\t\t\t\t\t\t\t\t" + address);
        System.out.println("Name Of Owner:\t\t\t\t\t\t\t\t\t" + owner);
        System.out.println("Length of Lease:\t\t\t\t\t\t\t\t" + lengthOfLease);
        System.out.println("Number of Units:\t\t\t\t\t\t\t\t" + numOfUnits);
        System.out.println("Unit Size:\t\t\t\t\t\t\t\t\t\t" + 900 + " sqft");
        System.out.println("Monthly Rent:\t\t\t\t\t\t\t\t\t$" + monthlyRent);
        System.out.println("Number of Washer/Dryer:\t\t\t\t\t\t\t" + numOfWashDry + "/unit");
        System.out.println("Total Number of Residents:\t\t\t\t\t\t" + totalNumOfResidents);
        System.out.println("Number of Floors:\t\t\t\t\t\t\t\t" + numOfFloors);
        System.out.println("Number of Parking Spaces:\t\t\t\t\t\t" + numOfParkingSpaces);
        System.out.println("Phone number:\t\t\t\t\t\t\t\t\t" + phoneNumOfOwner);
        System.out.println("Has a Pool:\t\t\t\t\t\t\t\t\t\t" + hasPool);
        System.out.println("Allows Pets:\t\t\t\t\t\t\t\t\t" + allowsPets);
        System.out.println("Is near a Gas Station:\t\t\t\t\t\t\t" + nearGasStation);
        System.out.println("Has a Basement\t\t\t\t\t\t\t\t\t" + hasBasement);
        System.out.println("Has Units for Rent:\t\t\t\t\t\t\t\t" + hasUnitsForRent);
        System.out.println("Has Air Conditioning:\t\t\t\t\t\t\t" + hasAirConditioning);
        System.out.println("Has Wheel Chair Accessibility:\t\t\t\t\t" + hasWheelChairAccess);
        System.out.println("Number Of Review Stars (Out of 5):\t\t\t\t" + numOfReviewStars);

        System.out.println("Monthly Rent After 3 Years:\t\t\t\t\t\t$" + monthlyRentAfter3Years);
        System.out.println("Monthly Rent After 6 Years:\t\t\t\t\t\t$" + monthlyRentAfter6Years);
        System.out.println("Average Number of Residents Per Unit:\t\t\t" + aveNumOfResidentsPerUnit);
        System.out.println("Average Number Of Parking Spots Per Unit:\t\t" + aveNumOfParkingSpotsPerUnit);
        System.out.println("Average Number of Units Per Floor:\t\t\t\t" + aveNumOfUnitsPerFloor);


    }
}
