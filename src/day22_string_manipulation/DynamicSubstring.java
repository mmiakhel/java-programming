package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        //substring + indexOf
        String results = "result count:12345";
        System.out.println(results.substring(13, 18));
        System.out.println(results.substring(13));

        //find the index of:
        System.out.println(results.indexOf(":"));
        int colonIndex = results.indexOf(":");
        System.out.println(results.substring(colonIndex + 1));
        //now we can combine them into 1 statement
        System.out.println(results.substring(results.indexOf(":") + 1));
        System.out.println(results.substring(results.indexOf("1")));

        String today = "i learned [python] today";
        /** find index of [
         * find index of ]
         * provide them as start, end index for substring
         * to print java
         */
        //2 steps
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start + 1, end));
        //or in 1 step
        System.out.println(today.substring(today.indexOf("[") + 1, today.indexOf("]")));




    }
}
