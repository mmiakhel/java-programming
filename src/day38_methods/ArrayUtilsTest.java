package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};
        int num = 5;

        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[] {23, 64, 23, 534, 234, 45, 234, 45}); //can print new array in same line //don't have to know this way



        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int[]{5, 23, 1, 543, 90, 456, 60, 80}));//declare in same line and print

        int[] nums2 = {4, 1, 5, 8};

        System.out.println("5 - found = " + ArrayUtils.contains(nums2, 5));
        System.out.println("10 - found = " + ArrayUtils.contains(nums2, 10));



    }
}
