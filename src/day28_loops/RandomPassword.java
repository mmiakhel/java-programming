package day28_loops;
import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for(int i = 1; i <= 8; i++) {
            int index = random.nextInt(71); //random num between 0-70
            System.out.print(source.charAt(index));
            password += source.charAt(index);
            //source.substring(index, index+1);
            //System.out.println(random.nextInt(source.length())); //can change 100 to any number (acts as a range that the random number is chosen from)
        }

        System.out.println("\nYour password = " + password);

    }
}
