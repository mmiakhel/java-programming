package practice_by_Saim;
/*
[Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph
 */

public class MiddleChar {
    public static void main(String[] args) {
        String word = "elephan";
        int half = word.length()/2;
       // System.out.println(word.charAt(half));

        if(word.length() % 2 == 0) {
            System.out.print((word.charAt(half -1) + "" + word.charAt(half)));
        } else if (word.length() % 2 != 0) {
            System.out.println(word.charAt(half));

        }
    }
}
