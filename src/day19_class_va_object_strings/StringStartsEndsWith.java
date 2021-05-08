package day19_class_va_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i")); //true
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("Int")); //false(case sensitive)

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Muzdalifa";
        if(name.endsWith("a")) {
            System.out.println("Maybe it's a female name");
        }

        /*
        Mr.  -> Man
        Dr.  -> Doctor
        Mrs. -> Married Woman
        Ms.  -> Single woman
        Sr.  -> Senior
         */
        String firstName = "Mrs. Miakhel";
        if(firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if(firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if(firstName.startsWith("Mrs.")) {
            System.out.println("Married Woman");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("Normal Name");
        }

        String url = "https://www.stackoverflow.gov";
        if(url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian Website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government Website");
        } else if(url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        } else {
            System.out.println("Invalid Website");
        }


    }
}
