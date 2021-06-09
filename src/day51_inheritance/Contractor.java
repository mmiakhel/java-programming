package day51_inheritance;

public class Contractor extends Employee{

    @Override
    public String toString() {
        return "Contractor{}";
    }

    @Override //1) lets everyone know that you are overriding
              //2) ensures that this method is being overridden. if not, it shows ERROR
    public double calculateSalary(double hourlyRate) {
        return 50 * 40 * hourlyRate;


    }

}
