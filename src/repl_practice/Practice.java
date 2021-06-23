package repl_practice;
import java.util.*;

public class Practice {
    public static int[] mergR(int[] a,int[] b) {
        int length = a.length + b.length;
        int itr = 0;
        int[] arr = new int[length];

        for (int i = 0; i < a.length; i++) {
            arr[itr] = a[i];
            itr++;
        }
        for (int i = 0; i < b.length; i++) {
            arr[itr] = b[i];
            itr++;
        }
       return arr;


    }//end mergR

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));
    }
}








