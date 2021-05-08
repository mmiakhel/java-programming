package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);

        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        currentSpeed += 20; // 45+20 = 65

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        double accountBalance = 250.25;
        double itemPrice = 300.99;
        System.out.println(accountBalance >= itemPrice);

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can afford item? - " + canAfford);

        //decrease balance by itemPrice using shorthand operator
        //accountBalance = accountBalance - itemPrice; can do it this way
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " + isBroke);

    }
}
