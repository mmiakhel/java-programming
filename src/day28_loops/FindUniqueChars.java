package day28_loops;
/**
 * given a string retrieve and print only unique characters
 */

public class FindUniqueChars {
    public static void main(String[] args) {
        String word = "jjjjaaaaavvvvvva";
        String unique = "";

        for(int i = 0; i < word.length(); i++) {
            //if word.charAt(i) is not contains unique
            //add to unique
            if(!unique.contains(word.charAt(i) + "")) { //if it doesn't not contain i then add it to unique
                unique += word.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
