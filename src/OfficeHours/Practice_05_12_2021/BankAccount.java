package OfficeHours.Practice_05_12_2021;

public class BankAccount {
    String accountHolderName;
    int pin;
    double balance;
    long accountNumber;

    public double getBalance(int inputPin){
        if(pin == inputPin){
            return balance;
        }
        return -1;
    }
}
