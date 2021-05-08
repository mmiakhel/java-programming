package day29_nestedloop_arrays;
/**
 * find duplicates and count
 * find unique character(appearing only once)
 * print character and number of occurrences
 */

public class StringNestedLoop {
    public static void main(String[] args) {
        String word1 = "java";
        for(int i = 0; i < word1.length(); i++){
            for(int j = 0; j <= i; j++) {
                System.out.print(word1.charAt(j));
            }
            System.out.println();
        }

        /**
         * java
         * jav
         * ja
         * j
         */

        for(int i = 0; i < word1.length(); i++){
            for(int j = i; j < word1.length(); j++) {
                System.out.print(word1.charAt(j));
            }
            System.out.println(); //new line after inner loop
        }








    }
}
