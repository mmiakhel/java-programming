package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital One";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l O")); //true
        System.out.println(company.contains("j")); //false
        System.out.println(company.contains("one")); //false

        //if company contains space, print: "multiple words"
        //else "single word company name
        if(company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains(" | ")) {
            System.out.println("Title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "ahmed";
        if(firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a & e are present");
        } else {
            System.out.println("a || e not present");
        }

        firstName = "Nadir";
        if(firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        } else {
            System.out.println("nor a or i is present");
        }

        String email = "mmiakhel@gmail.com";
        if(email.contains("@") && email.endsWith(".com")) {
            System.out.println("Correct email");
        } else {
            System.out.println("Incorrect email");
        }

        //CASE insensitive contains
        //goes from left to right. first convert to lower case, then check if "d" is present
        if(email.toLowerCase().contains("d")) {
            System.out.println("d is present");
        } else {
            System.out.println("d is not present");
        }


    }
}
