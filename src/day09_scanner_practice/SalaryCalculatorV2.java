package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12; //weeklyPay * 4 might not be accurate
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("Monthly pay: " + monthlyPay);
        System.out.println("Annual pay: " + annualPay);
    }
}
