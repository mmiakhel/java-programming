package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 4;

        /**
         * if number less than 1 or more than 10
         * print "ERROR: invalid input"
         * exit main method: return;
         */

        if(number < 1 || number > 10) {
            System.out.println("ERROR: invalid input");
            return; //exit main method/stop the program
        }

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

       // System.out.println(number +" X "+ 1 +" = " + (number*1));
//        System.out.println(number +" X "+ 2 +" = " + (number*2));
//        System.out.println(number +" X "+ 3 +" = " + (number*3));
//        System.out.println(number +" X "+ 4 +" = " + (number*4));
//        System.out.println(number +" X "+ 5 +" = " + (number*5));
//        System.out.println(number +" X "+ 6 +" = " + (number*6));

    }
}
