package OfficeHours.Practice_03_31_2021;

public class CountUpperLowerOrNumber {
    public static void main(String[] args) {
        String str = "2juMp41EEkd4s4";
        int upper = 0, lower = 0, number = 0;

        for(int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i);

            if(eachLetter >= 'A' && eachLetter <= 'Z') {
                upper++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lower++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                number++;
            }
        }
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("number = " + number);
    }
}
