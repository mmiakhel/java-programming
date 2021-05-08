package OfficeHours.Practice_04_27_2021;
//interview question

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        fib(8);


    }

    public static void fib(int num) {
        int[] arr = new int[num +1]; //add 1 because the first index is 0 and will always be included as well
        arr[0] = 0; //index 0 and 1 are ALWAYS 0 and 1. don't have to declare 0 index b/c always 0 but good for practice
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2]; //getting the value of last 2 indexes and adding them to assign to current index
        }
        System.out.println(Arrays.toString(arr));
    }


}
