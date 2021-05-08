package day31_arrays;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        //print all nums in same line
        System.out.println(Arrays.toString(nums));

        //sort nums. changes array values in ascending order
        Arrays.sort(nums);
        //print after sorting
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        //Arrays.sort(nums, Collections.reverseOrder());

        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly" };
        //arrays to string
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(", ", words) + "]"); //more flexible

        //sort first in alphabetic and ASCII order and then print
        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); //assembly is last cuz of lowercase (ASCII table big first and then lowercase)

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));


    }
}
