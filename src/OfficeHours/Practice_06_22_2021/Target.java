package OfficeHours.Practice_06_22_2021;

/*
Create a concrete class Target
    - Inherit Shopping and implement all abstract methods

    concrete --> first non-abstract class of the abstract parent class
 */

public class Target extends Shopping{

    @Override
    public void buyItem() {

        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {

        System.out.println("Returning item to Target");
    }
}
