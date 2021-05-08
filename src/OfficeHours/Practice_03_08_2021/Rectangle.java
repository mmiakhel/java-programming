package OfficeHours.Practice_03_08_2021;

import java.util.Scanner;

// PIC: Package -> Import -> Class

/*
Make a class Rectangle
create a main method

     - Declare two variables: length and width

         - Calculate the Perimeter 2(l+w)
         - Calculate the Area (w * l)

     - Print properties of the Rectangle

     - Modify to accept Scanner inputs
 */


public class Rectangle {
    public static void main(String[] args) {
            //hardcoded values
        //double length = 5;
       // double width = 3;

        // dynamic with Scanner

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length");
        double length = scan.nextDouble();
        System.out.println("Enter width");
        double width = scan.nextDouble();

        double perimeter = 2 * (length + width);
        double area = width * length;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);



    }
}
