package day33_arrays;
import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        //interview question
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //swap above using additional variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //            0  1   2   3
        int[] nums = {5, 10, 4, 100};
        System.out.println("Before swap: " + Arrays.toString(nums));
        temp = nums[0];
        nums[0] =nums[3];
        nums[3] = temp;
        System.out.println("after first and last swap: " + Arrays.toString(nums));


        int[] nums2 = {5, 10, 4, 100};
        System.out.println("Before: " + Arrays.toString(nums2));
        for(int i = 0; i < nums2.length/2; i++) {
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2;
        }
        System.out.println("After: " + Arrays.toString(nums2));

        System.out.print("\n");

        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("Before Reverse: " + Arrays.toString(words));
        for(int i = 0, j = words.length-1; i < words.length/2; i++, j--){
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
            //the below code also works
//        for(int i = 0,; i < words.length/2; i++) {
//            String temp3 = words[i];
//            words[i] = words[words.length - 1 -i];
//            words[words.length - 1 -i] = temp3;
//        }
        System.out.println("After Reverse: " + Arrays.toString(words));










    }
}
