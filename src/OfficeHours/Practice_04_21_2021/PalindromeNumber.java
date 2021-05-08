package OfficeHours.Practice_04_21_2021;
//interview question

public class PalindromeNumber {
    public static void main(String[] args) {
        /*
        number % 10 --> will always give the last number
        number / 10 --> will give back the number without the last number
         */
//        System.out.println(112 % 1);
//        System.out.println(112 % 10); //will give last digit
//        System.out.println(112 % 100); //will give last 2 digits

        System.out.println(isPalindrome(1234321));

    }


    public static boolean isPalindrome(int number) {
        //System.out.println(number % 10);
        int reverse = 0;
        int temp = number; //adding temp cuz to keep original in one
        while(temp != 0) {
//            System.out.println("last digit -  " + number % 10);
//            number /= 10; //number = number / 10; <-- both are the same thing (get's rid of the last number)
//            System.out.println("number after / 10 -  " + number);
//            System.out.println();
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
            System.out.println(reverse);


        }


        return reverse == number;
    }









}
