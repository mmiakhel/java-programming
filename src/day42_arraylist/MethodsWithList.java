package day42_arraylist;

import java.util.*;

public class MethodsWithList {
    public static void main(String[] args) {
        //long way to call the arraylist method (declare String arraylist and add values)
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("selenium");
        words.add("a");
        words.add("input");
        words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        //short way/declare in same line
        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23, 54, 23, 54554, 234, 11, 5, 2);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

        System.out.println(sumIntegerList(Arrays.asList(2, 4, 6, 8, 10)));

    }

    /**
     * methodName: printStrList
     * param: List of Strings
     * return: void
     * prints all values separated by space in same line
     */

    public static void printStrList(List<String> stringList) { //"java", "apple", "coffee", "tea"
        for (String each : stringList) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    /**
     * method: sumIntegerList
     * param: List of integers
     * returns int
     * calculates sum of integers in the list then returns
     */
    public static int sumIntegerList(List<Integer> nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }
}


