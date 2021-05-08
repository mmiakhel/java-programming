package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;
        double remainingBalance = balance - (price1 + price2 + price3);
        //double remainingBalance = balance - price1 - price2 - price3; ->this will work also cuz reading from left to right

        System.out.println("Your initial balance:\t\t\t\t\t $" + balance);
        System.out.println("Your remaining balance:\t\t\t\t\t $" + remainingBalance);

        //print remaining balance without change (219.68 -> 219)

        int balanceWithNoCents = (int) remainingBalance;
        System.out.println("Your remaining balance with no cents:\t $" + balanceWithNoCents);
    }
}
