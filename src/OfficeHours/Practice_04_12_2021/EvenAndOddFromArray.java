package OfficeHours.Practice_04_12_2021;
import java.util.*;
/*
Even and odd from arrayWrite a program that can count the even and odd number from an array of integers
Use for each to make it easier
Ex:Input: [4,1,3,12,5]
Output: Even:2
Odd: 3
 */

import javax.swing.*;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
// here we are getting a dynamic array from the user by asking for the numbers
      //  int[] nums = {4, 1, 3, 12, 5};  --> hard coded
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you have?");
        int[] nums = new int[input.nextInt()];

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Enter number " + (i+1));
            nums[i] = input.nextInt();
        }

        // we are ocunt the number of even and odd values from that array
        int even = 0;
        int odd = 0;

        for(int each : nums) {
            if(each % 2 == 0) { //checks odd: each % 2 != 0  or  for even: each % 2 == 0
                even++;
            } else {
                odd++;
            }
        }

        //used the counters of even and odd to make new arrays to store the values
        int[] evenNumbers = new int[even]; //have to make the array after counting so we know the size
        int[] oddNumbers = new int[odd];

        //here we go through every element, checks if it's even or odd
        // then it will store the number into the even or odd array
        //this storage is based on the e and o variables

        /*
             i -> keep track of the indexes in your nums array
             e -> keep track of the indexes in our evenNumbers array
             o -> keep track of the indexes in our oddNumbers array
         */

        for (int i = 0, e = 0, o = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                evenNumbers[e++] = nums[i];

            } else {
                oddNumbers[o++] = nums[i];

            }
        }
        //print the final arrays of even and odd numbers
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

    }
}
