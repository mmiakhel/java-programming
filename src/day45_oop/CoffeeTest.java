package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("Coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());

        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        //describe myCoffee -> show all variable values
        System.out.println(myCoffee.toString());

        //add another coffee object, set values, call methods
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("Coffee1 type = " + coffee1.getType());
        //assign coffee1 object to coffee2
        //basically saying: hey java, point coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;

        System.out.println("Coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuccino");
        //point to same object as coffee2
        coffee3 = coffee2;
        System.out.println("Coffee3 type = " + coffee3.getType());

        Coffee coffee4 = null; //reference variable does not refer/point to any object in HEAP. the type hasn't been set
        coffee4.setType("turkish"); //NullPointerException



    }
}
