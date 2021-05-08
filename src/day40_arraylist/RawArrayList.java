package day40_arraylist;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //declare raw arraylist
        ArrayList list1 = new ArrayList(); //normal way to call it
        List list2 = new ArrayList(); //polymorphic way--more popular way

        //add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println("list1 = " + list1);
        System.out.println("size = " + list1.size());

    }
}
