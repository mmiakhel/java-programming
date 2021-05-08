package OfficeHours.Problem_Set_1;
/*
========================================================== Operators =========================
================================= ----------------------------------------------------------
Analyze each step, What is the result of a, b, and c?
inta=3, b=2;
long c = (a-- + b) * 2 / 3 % 2; ----------------------------------------------------------
Analyze each step, What is the result numOne, numTwo, and biggest?
int numOne = 10;
int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2; int biggest = numOne > numTwo ? numOne : numTwo;
----------------------------------------------------------
 */

public class Operators {
    public static void main(String[] args) {
        int a=3, b=2;
        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        //           11->12->13
        int numOne = 10;
        //             10    * 3  +  12    +   12    % 2
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        System.out.println("numOne = " + numOne);
        System.out.println("numTwo = " + numTwo);

        int biggestNum = numOne > numTwo ? numOne : numTwo;
        System.out.println("biggestNum = " + biggestNum);

    }
}
