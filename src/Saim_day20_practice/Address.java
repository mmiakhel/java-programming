package Saim_day20_practice;
/*
A person will enter their address into a String. Make sure the String is not empty.
    If it is empty print: "No address found".
    If there is an address make all the text uppercase to match the expected format

        Ex:
            Input: 231332 leaf ave, lake city 3132
            Output: 231332 LEAD AVE, LAKE CITY 3132

        Ex:
            Input: ""
            Output: No address found
 */
//"231332 LEAD AVE, LAKE CITY 3132"

public class Address {
    public static void main(String[] args) {
        String address = "231332 lead ave, lake city 3132";

        if(address.contains("231332 lead ave, lake city 3132")) {
            System.out.println(address.toUpperCase());
        } else {
            System.out.println("address is lower case");
        }

        String noAddress = "";
        if(noAddress.isEmpty()) {
            System.out.println("No address found");
        }
    }
}
