package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "Toyota";
        String driverName = "Muzdalifa";
        String license = "A123456";
        int speed = 65;
        boolean isAutomatic = true;
        char licenseClass = 'A';

        //Toyota is car model.
        System.out.println(carModel + " is a car model.");
        System.out.println(driverName + " is driving a car.");

        //Muzdalifa is driving a Toyota.
        System.out.println(driverName + " is driving a " + carModel + ".");

        System.out.println("Car Model:\t\t\t" + carModel);
        System.out.println("Driver Name:\t\t" + driverName);
        System.out.println("License:\t\t\t" + license);
        System.out.println("Speed:\t\t\t\t" + speed + " MPH");
        System.out.println("Automatic:\t\t\t" + isAutomatic);
        System.out.println("License Class:\t\t" + licenseClass);

        System.out.println(licenseClass +", "+ isAutomatic);
    }
}
