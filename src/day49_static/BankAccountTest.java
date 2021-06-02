package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount husband = new BankAccount();
        husband.user = "Husband";

        husband.showBalance(); //500
        husband.spend(100.0);
        husband.showBalance(); //400

        BankAccount wife = new BankAccount();
        wife.user = "Wife";
        wife.showBalance(); //400
        wife.spend(200);
        wife.showBalance(); //200
        husband.showBalance(); //200



    }
}
