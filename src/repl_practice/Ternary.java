package repl_practice;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE:

        int num = (x>=5) ? x : -x;
        System.out.println(num);
    }
}
