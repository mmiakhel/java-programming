package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {
    /*
     * before java 8, interface was pure abstraction, only abstract methods were allowed
     * public abstract is automatically added, it is optional to type it
     *      void absMethodD(int num);
     */

    //interfaces can ONLY have PUBLIC STATIC FINAL variables
    public static final String TYPE = "interface";
    double MAX_COUNT = 50; //this is also public static final

    public abstract void absMethodD(int num);

    /**
     * starting from Java 8 (jdk 1.8)
     * interface can have static and default methods
     */

    //starting from java 8, static and default methods are allowed in interfaces
    public static void staticMethodE(String str) {

        System.out.println("staticMethodE is called with str - " + str);
    }

    //default method is a method with a body in the interface
    public default void defaultMethodF() {

        System.out.println("defaultMethodF is called");
    }


}
