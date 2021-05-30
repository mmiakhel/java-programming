package practice_by_Saim;
import java.util.Scanner;
/*
[Remove first and last]
Given two words. Print the first word without its first character then print the second word without its last character.
Input:
apple banana
Output: pple
banan
 */
public class RemoveFirstAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String wordOne = scan.nextLine();
        String wordTwo = scan.nextLine();


        System.out.println(wordOne.substring(1));
        System.out.println(wordTwo.substring(0,wordTwo.length()-1));
    }
}
