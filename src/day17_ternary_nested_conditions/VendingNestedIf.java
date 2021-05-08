package day17_ternary_nested_conditions;

/*
selection = drink or snack
drink = tea or coke
snack = chips or candy

when selection is drink sout(drink iption is selected)
                       --> when drink is tea --> tea is selected
                       --> when drink is coke --> coke is selected
When welection is snack sour (snack option is selected)
                        --> when snack is chips --> chips item is selected
                        --> when snack is candy --> candy item is selected


 */

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "drink";
        String drink = "coke";
        String snack = "chips";

        if (selection.equals("drink")) {
            System.out.println("Drink option is selected");
            if (drink.equals("tea")) {
                System.out.println("Tea is selected");
            } else  {
                System.out.println("Coke is selected");
            }
        } else if (selection.equals("snack")) {
                System.out.println("Snack option is selected");
            } if (snack.equals("chips")) {
                System.out.println("Chips item is selected");
            } else {
                System.out.println("Candy option is selected");
            }
    }
}
