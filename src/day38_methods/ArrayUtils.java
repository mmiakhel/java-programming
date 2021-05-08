package day38_methods;

public class ArrayUtils {
    public static void printArray(int[] nums) {
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static boolean contains(int[] nums2, int num) {
        boolean found = false;
        for(int each : nums2) {
            if(each == num) {
                found = true;
                break;
            }
        }
        return found;
    }



}
