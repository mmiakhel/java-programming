package day19_class_va_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(word.toUpperCase());



        word.toLowerCase(); //the value doesn't not change unless creat new variable for ex lin 16
        System.out.println(word); //

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        word = word.toLowerCase(); //word is permanently changed


        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company is uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);

    }
}
