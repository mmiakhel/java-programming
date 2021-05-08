package OfficeHours.Practice_03_02_2021;

// src -> new package called OfficeHours -> new package called
// Practice_03_02_2021

/*
Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information



    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star
 */

public class PersonInfo {
    public static void main(String[] args) {

        // Variables without any data

        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        // Assignment of data
        name = "Muzdalifa";
        age = 30;
        gender = 'M';
        student = true;
        numberOfSiblings = 5;
        favoriteNumber = 3L;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
        fullBirthDate = "" + birthDate + "." + year; // 3.2.2021. everything after ""(String) will also be a string so can use 'char'
        // fullBirthDate = birthDate + year + ""; // 2024.2 -> adds first then turns to String
        favoriteQuote = "have a good mindset";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Full Birthdate: " + fullBirthDate);

    }


}
