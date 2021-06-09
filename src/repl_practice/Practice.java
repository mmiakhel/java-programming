package repl_practice;
import java.util.*;

public class Practice {
    public static boolean isAnagram(String word1, String word2) {

        word1 = word1.toLowerCase().replace(" ", "");
        word2 = word2.toLowerCase().replace(" ", "");

        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();

        Arrays.sort(word1Char);
        Arrays.sort(word2Char);

        if(Arrays.equals(word1Char, word2Char)) {
            return true;
        } else {
            return false;
        }








    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }

}







