package day57_abstraction_polymorphism.abstract_class_vs_interface;

/**
 * extending: class can extend
 *
 *
 */

//first non-abstract child class of Abstract class or interface is called Concrete Class
public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    //concrete sub class must override abstract methods from abstract class or interface
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }

    //sub class can override non-final methods from parent class
    @Override
    public void methodB() {
        System.out.println("methodB overridden version is called");
    }

    //static methods are hidden --> not overridden
    //@Override -> static methods are hidden
    public static void staticMethodC() {
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called - " + num);
    }
}
