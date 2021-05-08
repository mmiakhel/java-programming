package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "";
        String model = "";
        double leasePrice = 0.0;

//        if(make.equals("Mercedes") && model.equals("E")) {
//            leasePrice = 500;
//        } else if (make.equals("Mercedes") && model.equals("A")) {
//            leasePrice = 400.0;
//        }

        if(make.equals("Mercedes")) {
            if(model.equals("E")) {
                leasePrice = 500;
            } else if (model.equals("A")) {
                leasePrice = 400;
            } else {
                System.out.println("Invalid Entry");
            }
        } else if(make.equals("Audi")) {
            if(model.equals("SQ5")) {
                leasePrice = 552;
            } else if (model.equals("A3")) {
                leasePrice = 412;
        } else {
                System.out.println("Invalid Entry");
                return;
            }

        }


        System.out.println("leasePrice = " + leasePrice);



    }
}
