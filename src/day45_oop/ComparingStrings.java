package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; //create String pool
        String word2 = "java"; //re-use from string pool
        String word3 = new String("java"); //create NEW object in HEAP, outside String pool
        String word4 = new String("java"); //create NEW object in HEAP, outside String pool

        System.out.println(word1 == word2); //true -->pointing to same java in heap pool
        System.out.println(word2 == word3);//false -->pointing to different java in heap and pool
        System.out.println(word3 == word4); //FALSE -->point to different objects in heap

        System.out.println(word1.equals(word2)); //true -->same data/values
        System.out.println(word1.equals(word3)); //true -->same data/values
        System.out.println(word3.equals(word4)); //true -->same data/values



    }
}
