package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int num = -9;
        if(num > 0) {
            System.out.println(num + " is positive");
        } else if(num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is the number");
        }
    }
}
