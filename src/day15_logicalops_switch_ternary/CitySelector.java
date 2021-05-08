package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";

        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to either one");
        } else {
            System.out.println("Not considering Seattle");
        }

        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is java class with " + teacher + ".");
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft Skills class with " + teacher + ".");
        } else {
            System.out.println("Some other class with " + teacher + ".");
        }

        String company = "Google";
        double salary = 80_000.0;
        if (company.equals("Google") && (salary >= 100000)) {
            System.out.println("I accept the offer " + company);
        } else
            System.out.println("Rejecting offer from " + company);
    }
}
