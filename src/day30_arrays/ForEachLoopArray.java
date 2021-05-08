package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        //index       0    1   2     3   4    5    6    7    8   9
        int[] data = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};

        System.out.println("------------FOR EACH LOOP------------");
        //for each loop
        for(int eachNum : data) {
            System.out.print(eachNum + " ");
        }

        System.out.println();
        System.out.println("--------------FOR LOOP--------------");
        //for loop
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();

        //print last value in array using length - 1
        System.out.println("Last value: " + data[data.length-1]);

        //loop array reverse
        //print all numbers in backwards in same line
        System.out.println("------------REVERSE------------");
        for(int j = data.length-1; j >= 0; j-- ){
            System.out.print(data[j] + " ");
        }






    }
}
