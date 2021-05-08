package day19_class_va_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon".length());
        String firstName = "Muzdalifa";
        System.out.println(firstName + " - " + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";
        /*
        when password is at least 6 characters:
        print: Valid amazon Password
        else print: password too short
         */
        if(password.length() >= 6) {
            System.out.println("Valid Amazon Password");
        } else {
            System.out.println("Passwords must be at least 6 characters.");
        }
    }
}
