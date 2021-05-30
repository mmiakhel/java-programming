package repl_practice;
import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double screenSize = 0.0;
        String cpu = "";
        int ramSize = 0;
        String storageType = "";
        int storageSize = 0;
        String screenResolution = "";
        double price1 = 0.0;
        double price2 = 0.0;
        double price3 = 0.0;
        double price4 = 0.0;
        double price5 = 0.0;

        System.out.println("Select screen size:");
        screenSize = scan.nextDouble();
        if (screenSize == 13.3) {
            price1 += 200;
        } else if (screenSize == 15.0) {
            price1 += 300;
        } else {
            price1 += 400;
        }
        System.out.println("Select CPU type:");
        cpu = scan.next();
        if (cpu.equals("i3")) {
            price2 += 150;
        } else if (cpu.equals("i5")) {
            price2 += 250;
        } else {
            price2 += 350;
        }

        System.out.println("Select RAM size:");
        ramSize = scan.nextInt();
        price3 = (ramSize/4) * 50;


        System.out.println("Select storage type:");
        storageType = scan.next();

        System.out.println("Enter storage size:");
        storageSize = scan.nextInt();
        if (storageSize == 500) {
            price4 += 50;
        } else {
            price4 += 100;
        }

        System.out.println("Enter screen resolution:");
        screenResolution = scan.next();
        if (screenResolution.equals("FULLHD")) {
            price5 += 100;
        } else {
            price5 += 200;
        }

        double price6 = price1 + price2 + price3 + price4 + price5;

        System.out.println("Laptop price is: " + price6);

    }
}