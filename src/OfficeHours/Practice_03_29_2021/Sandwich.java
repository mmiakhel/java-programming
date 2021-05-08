package OfficeHours.Practice_03_29_2021;

public class Sandwich {
    public static void main(String[] args) {
        String str = "breadjambread";

        if(str.contains("bread")) {
            int firstBread = str.indexOf("bread");
            if(str.substring(firstBread+5).contains("bread")) { //jambread
                int secondBread = str.substring(firstBread +5).indexOf("bread");
            } else {
                System.out.println("nothing");
            }

        } else {
            System.out.println("Nothing");
        }


    }
}
