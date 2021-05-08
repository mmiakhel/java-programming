package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int star = 1; star <= 15; star++) {
            System.out.print("* ");
        }

        System.out.println(); //start new line
        String myStars = "";
        //for loop: fill 5 stars to myStar variable
        for(int stars = 1; stars <= 5; stars++) {
            myStars += "* ";
        }


        System.out.println("my stars = " + myStars.trim()); //* * * * *
    }
}
