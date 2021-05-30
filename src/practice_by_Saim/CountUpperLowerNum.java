package practice_by_Saim;
/*
Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
Ex:
Input: 2juMp41EEkd4s4 Output:
3 uppercase letters
6 lowercase letters
5 numbers
 */

public class CountUpperLowerNum {
    public static void main(String[] args) {
        String str = "2juMp41EEkd4s4";
        int upperCase = 0;
        int lowerCase = 0;
        int num = 0;

        for(int i = 0; i <= str.length()-1; i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCase+=1;
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCase+=1;
            } else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num+=1;
            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("num = " + num);
    }
}
