package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;

        String reply = (hourlyRate > 45) ? "Accept" : "Reject";

        System.out.println("reply = " + reply);

        String todaysClass = "java";
        String teacher = todaysClass.equals("java") ? "Murodil/Saim" : "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "has DL, can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
