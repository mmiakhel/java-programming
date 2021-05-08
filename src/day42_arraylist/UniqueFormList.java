package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFormList {
    public static void main(String[] args) {
        //declare Integer arrayList with following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println(nums);
        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("\nuniqueList = " + uniqueList);

    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        //new arraylist to store only unique numbers
        List<Integer> uniqueList = new ArrayList<>();
        //loop thru the list
        for(int each : nums) {
            //check if number appears only ONCE in the list
            if(Collections.frequency(nums, each) == 1) {
                //print that number
                System.out.print(each + " ");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
