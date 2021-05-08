package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and then month:");
        double rent = scan.nextDouble();
        scan.nextLine(); //to fix the glitch need to add this above nextLine();
        String month = scan.nextLine(); //nothing prints because when we press enter above that enter is assigned to String so month will not show up

        System.out.println("rent = " + rent);
        System.out.println("month = " + month);
    }
}
