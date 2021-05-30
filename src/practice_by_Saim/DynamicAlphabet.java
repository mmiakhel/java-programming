package practice_by_Saim;
import java.util.Scanner;
/*
[Dynamic alphabet]
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z •
If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or order descending
- Ascending:A–Zora–z
- Descending:Z–Aorz–a
 */

public class DynamicAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper or Lower Case");
        String upperOrLower = scan.nextLine();
        System.out.println("Ascending or Descending Order");
        String AscOrDes = scan.nextLine();
        char start = 'a';
        char end = 'z';


        if(upperOrLower.equals("upper")) {
            for(char i = 'A'; i <= 'Z'; i++){
                System.out.print(i);
            }
        } else if (upperOrLower.equals("lower")) {
            for (char i = 'a'; i <= 'z'; i++) {
                System.out.print(i);
            }
        }

        if(AscOrDes.equals("ascending")) {
            for(char i = start; i <= end; i++ ){
                System.out.print(i);
            }
        } else if (AscOrDes.equals("descending")){
            for(char i = end; i >= start; i-- ){
                System.out.print(i);
            }
        }

    }
}
