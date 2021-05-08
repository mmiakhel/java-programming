package day10_shorthand_operators;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        //String weather = scan.next(); //only accepts one word
        String weather = scan.nextLine(); //will accept the whole line until hit enter
        System.out.println(weather + " - it's a nice day today!");
    }
}
