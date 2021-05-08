package OfficeHours.Practice_03_24_2021;

public class CharIndex {

    public static void main(String[] args) {

        /*
        Index

        java is
        0123456


        charAt(number) -> gives a char
        indexOf(character) -> gives a number (index)
         */



        String s ="java";
        //         0123
      //  System.out.println(s.charAt(s.length())); //error b/c index 4 doesn't exist in java
        System.out.println(s.charAt(s.length()-1)); //will give the last index ans = a

//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));

        System.out.println("" + s.charAt(0) + s.charAt(3));

        String upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3); //JAVa
        System.out.println(upper);


        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('m'));

        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j') >= 0 ? "contains" : "not contains");
        System.out.println(s.indexOf('g') >= 0 ? "contains" : "not contains");

        System.out.println(s.toLowerCase().contains("a"));
        System.out.println(s.toLowerCase().startsWith("a"));
        System.out.println(s.toLowerCase().replace("j", "e").startsWith("a"));




    }
}
