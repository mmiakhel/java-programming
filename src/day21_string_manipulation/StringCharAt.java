package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
       // System.out.println(word.charAt(4)); error when it's run
        System.out.println(word + "-" + word.length()); //4

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);
        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth
                            + " " + sixth + " " + seventh + " " + eighth);

        String withSpaces = first + " " + second + " " + third + " " + fourth + " " + fifth
                             + " " + sixth + " " + seventh + " " + eighth;
        System.out.println("withSpaces = " + withSpaces);

        String noSpaces = first + "" + second + "" + third + "" + fourth + "" + fifth
                + "" + sixth + "" + seventh + "" + eighth;
        System.out.println("noSpaces = " + noSpaces);

/*
 char word1Let1 = word1.charAt(0);
    char word1Let2 = word1.charAt(1);
    char word1Let3 = word1.charAt(2);
    char word2Let1 = word1.charAt(0);
    char word2Let2 = word1.charAt(1);
    char word2Let3 = word1.charAt(2);
 */







    }
}
