package practice_by_Saim;
/*
[Initials]
Given a person's name in a String (first and last name), then prints out the initials of the user.
The initials should be uppercase.
Ex:
input: james bond
output: your initials are JB
 */

public class Initials {
    public static void main(String[] args) {
        String fullName = "james bond";
        int indexOfSpace = fullName.indexOf(" ");
        String firstInitial = "" + fullName.toUpperCase().charAt(0);
        String lastInitial = "" + fullName.toUpperCase().charAt(indexOfSpace +1);

        System.out.println(firstInitial + lastInitial);





    }
}
