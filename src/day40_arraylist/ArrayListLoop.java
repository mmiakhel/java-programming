package day40_arraylist;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());
        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);

        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println("nums = " + nums);

       // nums.remove(88); --> thinks asking for index 88 --> indexOutOfBoundsException
        nums.remove(new Integer(88)); //remove the # 88
        System.out.println("nums = " + nums);

        nums.remove(new Integer(5)); //removes only the first 5
        System.out.println("nums = " + nums);

        //for loop--iterate thru all values and print
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();

        //for each loop and print all in same line
        for(int each : nums) {
            System.out.print(each + " ");
        }

    }
}
