package practice_by_Saim;
/*
[Creating an email]
Ask user to enter two strings. Both of these strings should be at least 6 character long.
If they are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and combine
them with the last three characters of the second string. At the end of your combined string add “@cybertek.com”
and print the final string as your created email. The final email should be in all lowercase.
input: JamesBond Secret
output: jameret@cybertek.com
 */

public class CreatingAnEmail {
    public static void main(String[] args) {
        String one = "JamesBond";
        String two = "Secret";
        String email = "";

        if(one.length() >= 6 && two.length() >= 6) {
            email += one.toLowerCase().substring(0,4);
            email += two.toLowerCase().substring(two.length() -3);
            email += "@cybertek.com";
            System.out.println(email);
            //System.out.println(one.toLowerCase().substring(0,4) + two.toLowerCase().substring(two.length() -3) + "@cybertek.com");

        } else {
            System.out.println("Invalid data");
        }


    }
}
