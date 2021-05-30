package practice_by_Saim.Loops_Practice_3;
/*
Reverse only second word
Given a String with three words separated by spaces. Reverse only the second word and return the modified String
Ex:
I love java
I evol java
 */

public class ReverseSecondWord {
    public static void main(String[] args) {
        String word = "I love java";

        //System.out.println(word.indexOf(" "));
       // System.out.println(word.substring(word.indexOf(" ")+1,word.indexOf(" ") + 5));


        for(int i = 0; i < word.length(); i++){
            for(int j = i; j > word.length(); j--) {
                System.out.print(word.charAt(i));
            }
            System.out.println();

        }

        
    }
}
