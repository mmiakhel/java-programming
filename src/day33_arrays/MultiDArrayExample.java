package day33_arrays;
import java.util.*;

public class MultiDArrayExample {
    public static void main(String[] args) {
       // String[][] users = "";
        String[][] userData = {  {"Teodora Tsvetanova", "TeodorasPWD12"},
                                 {"Anna Ziyayeva", "AnnaAlmaty123"},
                                 {"Parvin Altae", "ParvinVienna321"}  };

        //System.out.println(userData[0][0].split(" ")[0]); --> to print only first name
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);
        System.out.println();

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));








    }
}
