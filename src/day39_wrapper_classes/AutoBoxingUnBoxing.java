package day39_wrapper_classes;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        //autoboxing
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234; //also considered autoboxing

        //un-boxing: object ---> primitive
        Double d1 = new Double(100.5);
        double d2 = d1;
        double d3 = new Double(345.3); //object assigned to primitive(value is assigned to primitive)



    }
}
