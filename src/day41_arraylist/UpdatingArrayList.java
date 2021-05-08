package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        //jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla
        System.out.println(myCars.toString()); //toString is optional--prints all cars
        String allCarsIn1Str = myCars.toString(); //to store/save it as 1 string then use .toString()

        System.out.println("allCarsIn1Str = " + allCarsIn1Str);

        //change index 0 to Lamborghini
        myCars.set(0, "lamborghini");

        System.out.println("after set = " + myCars.toString()); //internally uses toString

        //change 4 to Honda
        myCars.set(4, "honda");
        System.out.println("after setting with honda = " + myCars.toString());

        /**
         * How would you do that if myCars was array:
         * myCars[4] = "honda";
         */

        /**
        String str = "java";
        str.indexOf("v") ==> 2
        myCars.indexOf("honda");
         */

        //find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change moskvich to jiguli
        myCars.set(moskvichIndex, "jiguli");
        System.out.println("after set to jiguli = " + myCars);

        //replace ford with trabant using single statement
        //indexOf("ford"), replace with "trabant"
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to trabant = " + myCars);

        //lada -> bugatti. preventing the outofboundsexception error
        if(myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
        } else {
            System.out.println("lada is not found");
        }
        System.out.println("after set to bugatti = " + myCars.toString());

        /**
         lamborghini -> prius
         lada -> lexus
         traban -> audi
         //no exception error and can change several at once
         */
        for (int i = 0; i < myCars.size(); i++) {
            if(myCars.get(i).equals("lamborghini")) {
                myCars.set(i, "prius");
            } else if(myCars.get(i).equals("lada")) {
                myCars.set(i, "lexus");
            } else if(myCars.get(i).equals("trabant")) {
                myCars.set(i, "audi");
            }
        }
        System.out.println("after loop = " + myCars);


    }
}
