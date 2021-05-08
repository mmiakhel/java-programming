package day38_methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("hello"));
        String word = null;
       // System.out.println(word.toUpperCase());


        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.isEmpty());
        //if(str == null || str.isEmpty()) {
            //return true;
        //}
       // return false;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
        //can use the below code as well:
        //boolean palindrome = false;
//        for (int i = str.length()-1, j=0; i >=0; j++, i--) {
//            if(str.charAt(i) == str.charAt(j)) {
//                palindrome = true;
//            }
//        }
//        return palindrome;
    }

    public static String reverse(String str) {
        String strReverse = "";
        for (int i = str.length()-1; i >=0; i--) {
            strReverse += str.charAt(i);
        }
        return strReverse;
    }

















}
