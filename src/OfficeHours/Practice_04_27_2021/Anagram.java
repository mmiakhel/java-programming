package OfficeHours.Practice_04_27_2021;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));

    }

    //2 ways to do it:
    //1) toCharArray -> sort -> equal ?
    //2) loop thru one String -> remove the char that you iterate throughout in the other String -> if empty the 2nd String is empty?

    public static boolean isAnagram(String one, String two) {
        //1st thing to check no matter what is check the lengths

        if(one.length() != two.length()) {
            return false;
        }

        one = one.toLowerCase();
        two = two.toLowerCase();

        int[] count = new int[26]; //use to keep track of how many a's, b's are in one string

        //listen -> l+1, i+1, s+1
        //silent -> s-1, i-1, etc

        //ab a+1, b+1
        //bc b-1, c-1

        //a->0, b=1, c=2, etc
        //z->25

        for (int i = 0; i < one.length(); i++) {
            char letterFromOne = one.charAt(i);
            char letterFromTwo = two.charAt(i);

            count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
            count[letterFromTwo - 97] = count[letterFromTwo - 97] - 1;

            System.out.println(Arrays.toString(count));



        }
        return Arrays.equals(count, new int[26]);


    }

}
