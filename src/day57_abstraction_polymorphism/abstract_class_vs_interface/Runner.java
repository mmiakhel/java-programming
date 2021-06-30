package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        //we cannot create object (instantiate) abstract class or interface class
        /**
         * AbstractA abs = new AbstractA();
         * InterfaceA inf = new InterfaceA();
         */

        //static method so that's why it can be called without creating an object. can be called with className.methodName
        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello");  --> staticMethodE only works with interface.staticMethodE
        ConcreteA.staticMethodC();

    }
}
