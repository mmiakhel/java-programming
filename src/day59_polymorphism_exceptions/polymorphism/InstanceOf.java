package day59_polymorphism_exceptions.polymorphism;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        //instance of operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle); //will give boolean (true) b/c shape is created from Circle
        System.out.println(shape instanceof Square); //false b/c shape is not created from Square
        if(shape instanceof Circle) {
            System.out.println("It is a Circle Object");
        } else if (shape instanceof Square) {
            System.out.println("It is a Square object");
        }

        /**
         * java reflection API
         */
        System.out.println(shape.getClass().getSimpleName()); //just class name of object
        System.out.println(shape.getClass().getName()); //class name of object and package name
        if(shape.getClass().getSimpleName().equals("Square")) {
            System.out.println("It is a square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("Object class name of el variable = " + el.getClass().getSimpleName());
        //System.out.println(el.getClass().getDeclaredFields());
    }
}
