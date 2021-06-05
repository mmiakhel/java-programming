package day50_inheritance.overriding;

public class Dog extends Animal{
    public void run() {
        System.out.println("Dog is running...");
    }
    public void speak() {
        System.out.println("Dog is saying WOOF.");
    }
}
