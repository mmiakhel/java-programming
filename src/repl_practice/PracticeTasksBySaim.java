package repl_practice;
import java.util.Scanner;

public class PracticeTasksBySaim {
    public static void main(String[] args) {
//       //1
//        int a =5;
//        int b = a++ + a-- + a * 2 + a + ++a;
//        System.out.println(a); //6
//        System.out.println(b); //32
//
//        //2
//        int a2 = 200;
//        int b2 = -a++ + - --a * a-- % 2 + a;
//        System.out.println("a = " + a); //5
//        System.out.println("b = " + b); //32
//
//        //3
//        int x = 300;
//        int y = 400;
//        int z = x + y - x * y + x / y;
//        System.out.println("x = " + x); //300
//        System.out.println("y = " + y); //400
//        System.out.println("z = " + z); //=119300
//
//        //4
//        int num = 65;
//        boolean isDivisibleBy2 = num % 2 == 0;
//        boolean isDivisibleBy3 = num % 3 == 0;
//        boolean isDivisibleBy5 = num % 5 == 0;
//
//
//        //5
//        int age = 18;
//        if (age >= 18) {
//            System.out.println("Eligible to vote");
//        } else {
//            System.out.println("Not eligible to vote");
//        }
//
//        //6
//
//        boolean isTrue = !true;
//        boolean isFalse = !false;
//
//        //7
//
//        int angle1 = 0;
//        int angle2 = 0;
//        int angle3 = 0;
//        int sum = angle1 + angle2 + angle3;
//
//        if (sum == 180) {
//            System.out.println("Triangle is valid");
//        } else {
//            System.out.println("Not a valid triangle");
//        }
//
//        //or you can use boolean
//        boolean isValid = (sum == 180);
//
//
//        //8 GradeRetake
//        int baseGrade = 90;
//        int retake = 1;
//        int retakePenalty = 0;
//
//        if(retake == 1) {
//            retakePenalty = (int)(baseGrade * 0.10);
//        }  if (retake == 2) {
//            retakePenalty = (int)(baseGrade * 0.20);
//        } if (retake == 3) {
//            retakePenalty = (int)(baseGrade * 0.35);
//        }
//        System.out.println("Grade after retake attempt: " + retake + " was: " + (baseGrade - retakePenalty));
//
//        //9
//        int year = 4;
//        if((year % 4) == 0) {
//            System.out.println("Year is a leap year");
//        } else {
//            System.out.println("Year is not a leap year");
//        }

        //10
//        int salary = 0;
//        boolean isFullTime = true;

        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter salary:");
//        salary = scan.nextInt();
//        System.out.println("Full Time/Part Time");
//        isFullTime = scan.nextBoolean();
//
//        if(isFullTime) {
//            salary += 20000;
//        } else {
//            salary -= 5000;
//        }
//
//        System.out.println("Final salary: " + salary);

        //11
//        int oxygenLevel = 55;
//        if(oxygenLevel > 90) {
//            System.out.println("Your tank is full");
//        } else if (oxygenLevel <= 90 && oxygenLevel > 80) {
//            System.out.println("Still okay");
//        } else if (oxygenLevel <= 80 && oxygenLevel > 70) {
//            System.out.println("Don't go too far");
//        } else if (oxygenLevel <= 70 && oxygenLevel > 60) {
//            System.out.println("Start to head back");
//        } else if (oxygenLevel <= 60 ) {
//            System.out.println("Be careful, now you are at " + oxygenLevel + "%");
//        }

        //12
      //  System.out.println("Enter 3 numbers:");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        if(num1 > num2 && num2 > num3) {
//            System.out.println(num1 + " is the biggest value of the 3");
//        } else if(num2 > num3 && num2 > num1) {
//            System.out.println(num2 + " is the biggest value of the 3");
//        } else if(num3 > num1 && num2 > num1) {
//            System.out.println(num3 + " is the biggest value of the 3");
//        } else if (num1 == num2 && num2 == num3){
//            System.out.println("All integers are the same");
//        }

        //13
        System.out.println("Enter a number");
        int monthNumber = scan.nextInt();
        switch(monthNumber) {
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
        }





    }
}
