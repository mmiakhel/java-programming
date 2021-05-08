package day13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("****** WELCOME TO TD BANK ATM ******\n");

        int secretPinCode = 2233;
        int inputPinCode = 2233;

        if (secretPinCode == inputPinCode) {
            System.out.println("Welcome to your account.\n" +
                    "You can withdraw, check your balance, deposit.");
        } else {
            System.out.println("Incorrect pin code! " + inputPinCode + "\n" +
                    "Please try again!");
        }

        System.out.println("\nThank you for using TD Bank ATM!");
    }
}
