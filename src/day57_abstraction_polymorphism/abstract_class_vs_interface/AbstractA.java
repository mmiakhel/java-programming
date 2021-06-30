package day57_abstraction_polymorphism.abstract_class_vs_interface;

/*
-> abstract class can have abstract, non-abstract and static methods
-> abstract classes can have instance variables, static variables with all access modifiers
 */

public abstract class AbstractA {
    int num1;
    private double price;
    public static int count;
    public final String type = "abstract";
    public static final String LANGUAGE = "java";

    //abstract method
    public abstract void absMethodA();

    //non-abstract method
    public void methodB() {
        System.out.println("methodB is called");
    }

    //static method
    public static void staticMethodC() {
        System.out.println("static methodC is called");
    }

}
