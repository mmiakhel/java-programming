package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "change"; -->ERROR: cannot change value of final variable
        final int SSN = 432123433;
        //SSN = 23342345; -->ERROR: variable is final
    }
}
