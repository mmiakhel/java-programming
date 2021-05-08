package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * 1) word.substring(startIndex, endIndex)
         * endIndex is not included
         */
        System.out.println(word.substring(0, 3));  //jav
        System.out.println(word.substring(0, 4));  //java
        System.out.println(word.substring(0, 7));  //java is
        System.out.println(word.substring(5, 7));  //is
        System.out.println(word.substring(8, 11)); //fun

        /**
         * 2) substring(startIndex) -  it will read from start until end
         */
        System.out.println(word.substring(8));     //fun
        System.out.println(word.substring(5));     //is fun



    }
}
