package practice_by_Saim;
import java.util.Scanner;
/*
[IQ] Palindrome
A word that is the same read forwards and backwards. User takes a word from the console.
Print true if the word is a palindrome. Print false if the word is not palindrome.
-> input: civic -> output: true
-> input: java -> output: false
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        String palindrome = "";

        for(int i = word.length()-1; i >= 0; i--){
            palindrome += word.charAt(i);
        }
        System.out.println(word.equals(palindrome));

        //what is your string has a million characters
        String word2 = "anna";
        boolean isPalindrome = true;
        for(int j = 0; j < word2.length()/2; j++) { //checking half a million; no need to go thru the whole million
            if(word2.charAt(j) != word2.charAt(word2.length()-1-j)) {
                isPalindrome = false;
                break;

            }

        }
        System.out.println(isPalindrome);


    }
}
