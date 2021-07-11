package OfficeHours.Practice_06_22_2021;

/*
Create an interface Shipping
    - Declare an abstract methods:
        payForShipping(boolean)

        //interface --> another way in java to achieve abstraction
                    --> it was pure abstraction in the beginning but after java 8 it is not pure anymore (not pure abstraction)
                    --> any methods made in abstract class is by default abstract so no need to write abstract in method
                    --> public by default as well, so no need to write public in method
 */

public interface Shipping {
    boolean payForShipping(double price);

}
