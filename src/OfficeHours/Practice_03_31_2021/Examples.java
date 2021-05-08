package OfficeHours.Practice_03_31_2021;

public class Examples {
    public static void main(String[] args) {

       String str = "java";
       char letter = 'a';
       int count = 0;

       for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == letter) {
               count++;
           }
       }

        System.out.println(letter + " was found " + count + " times in " + str);



    }
}
