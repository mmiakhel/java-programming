package OfficeHours.Problem_Set_1;
import java.util.Scanner;
/*========================================================== If statements, multi branch, nested =============
[Character Checker]
Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase
'G' --> uppercase 'O' --> uppercase
Hint: Use the ASCII table
 ---------------------------------------------------------- [Pandemic Checker]
Write a program that will read a number from the user. This number will be a year. Use that given year to figure out
if there was a pandemic in that year, and if there was which one.
Data to use:
1346-1353: The Black Death
1665-1666: Great Plague of London
1770-1772: Russian plague
1889-1890: Flu pandemic
1916: American polio epidemic
1918-1920: Spanish Flu
2009-2010: H1N1 Swine Flu pandemic
2014-2016: West African Ebola epidemic
2020-2021: COVID-19
Less than 0 and more then 2021:
Invalid year Any year not in those ranges: No Pandemic

 */

public class IfMultiNested {
    public static void main(String[] args) {
        char letter = 'u';
        if(letter >= 65 && letter <= 90) {
            System.out.println("Uppercase Letter");
        } else if(letter >= 97 && letter <= 122)  {
            System.out.println("Lowercase Letter");
        } else {
            System.out.println("Invalid");
        }

        int year = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year:");
        year = scan.nextInt();
        if (year >= 1346 && year <= 1353) {
            System.out.println("The Black Death");
        } else if (year >= 1665 && year <= 1666) {
            System.out.println("Great Plague of London");
        } else if (year >= 1770 && year <= 1772) {
            System.out.println("Russian Plague");
        } else if (year >= 1889 && year <= 1890) {
            System.out.println("Flu Pandemic");
        } else if (year == 1916) {
            System.out.println("American Polio Epidemic");
        } else if (year >= 1918 && year <= 1920) {
            System.out.println("Spanish Flu");
        } else if (year >= 2009 && year <= 2010) {
            System.out.println("H1N1 Swine Flu Pandemic");
        } else if (year >= 2014 && year <= 2016) {
            System.out.println("West African Ebola Epidemic");
        } else if (year >= 2020 && year <= 2021) {
            System.out.println("COVID-19");
        } else if (year < 0  && year > 2021) {
            System.out.println("Invalid Year");
        } else {
            System.out.println("No Pandemic");
        }


    }
}
