package OfficeHours.Practice_04_14_2021;
/*
[IQ] Second Biggest Number
Given an Array of numbers. Find and print the 2nd biggest number.
Note the 2nd biggest should be unique meaning it should be different from the max number
Example:
Input:[4,3,1,4,5,2,4,8,4,8]
Output:5
 */

public class SecondBiggestNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,1,4,5,2,4,8,4,8};
        int max = nums[0];
        int secondMax = nums[0];

        for(int eachNum : nums) {
            if(eachNum > max) {
                secondMax = max;
                max = eachNum;
            }

            if(eachNum > secondMax && eachNum < max) {
                secondMax = eachNum;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + secondMax);












    }
}
