package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Amazon";
        String jobDescription = "Perform testing";
        double salary = 150000.00;
        int yearsExp = 5;
        boolean hasBenefits = true;

        System.out.println("Title:\t\t\t\t\t" + title);
        System.out.println("Company:\t\t\t\t" + company);
        System.out.println("Job Description:\t\t" + jobDescription);
        System.out.println("Salary:\t\t\t\t\t$" + salary);
        System.out.println("Years of Experience:\t" + yearsExp);
        System.out.println("Has Benefits?\t\t\t" + hasBenefits);
    }
}
