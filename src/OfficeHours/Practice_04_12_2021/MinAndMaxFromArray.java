package OfficeHours.Practice_04_12_2021;
/*
Max and Min number from Array•
Write a program that can find the maximum number from any given int array•
Write a program that can find the minimum number from any given int array
 */

public class MinAndMaxFromArray {
    public static void main(String[] args) {

        int[] arr = { 3, 1, 5, 3, 10, 4, 3};

        int max = arr[0]; //store first element instead of 0. b/c everything is greater than 0 etc
        int min = arr[0];

        for(int each : arr) {
            //each -> every element | for loop: arr[i]
            if(each < min) {
                min = each;
            }

            if(each > max) {
                max = each;
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
