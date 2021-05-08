package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";

        if(todaysClass.equals("java"))
            System.out.println("Java is fun");
       // System.out.println("java is fun again");
        else
        System.out.println("it's not java, it is " + todaysClass);

        int a = 1;
        if(a == 1)
            System.out.println("a is 1");
            System.out.println("1 is a");




    }
}
