package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; //single variable
        //array variable //assigning the long way
        int[] nums = new int[3]; //array variable
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        //nums[3] = 100;

        //print walues of array
        System.out.println("value at index 0 = " + nums[0]); //index 0
        System.out.println("value at index 1 = " + nums[1]); //index 1
        System.out.println("value at index 2 = " + nums[2]); //index 2
       //System.out.println("value at index 3 = " + nums[3]); //outofbounds exception because in the beginning we only declared 3 nums

        ////we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); //10

        //how to find out the size of the array
        System.out.println("number of elements = " + nums.length); //no () after length
        //store length of array into length(len) variable
        int len = nums.length;
        System.out.println("len = " + len);

        //change values in the array:
        nums[0] = 100;
        nums[1] = 300;
        //read the value of index1 and assign same to index2
        nums[2] = nums[1];

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);










    }
}
