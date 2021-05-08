package day15_logicalops_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int oranges = 7;
        System.out.println(apples > 3 || oranges > 4);

        if (apples > 3 || oranges > 4) {
            System.out.println("No need to by any fruits today");
        } else {
            System.out.println("Need to get some fruit");
        }

        System.out.println(apples > 2 || oranges > 10);
        System.out.println(apples > 2 && oranges > 10);

             //true    OR  false      = true
        if (apples > 2 || oranges > 10) {
            System.out.println("Looks like you are good with fruit");
        } else {
            System.out.println("Need to buy some fruits");
        }
                            //false    OR   false =   false
        System.out.println(apples == 0 || oranges == 0);

        if (apples == 0 || oranges == 0) {
            System.out.println("Need to buy some fruits.");
        } else {
            System.out.println("No need to buy more fruits.");
        }

    }
}
