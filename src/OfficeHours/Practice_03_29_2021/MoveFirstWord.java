package OfficeHours.Practice_03_29_2021;

public class MoveFirstWord {
    public static void main(String[] args) {
        String str = "Javascript is a fun language";
        str = str.trim();
        int space = str.indexOf(" ");
        String firstWord = str.substring(0, space);
        System.out.println(str.substring(space + 1) + " " + firstWord);

    }
}
