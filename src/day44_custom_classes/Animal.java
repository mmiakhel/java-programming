package day44_custom_classes;

public class Animal {
    String type = "some animal";
    public void eat() {
        System.out.println(type + " can eat");
    }

    public void eat(String food) {
        System.out.println(type + " eats " + food);
    }

    public void speak() {
        System.out.println(type + " can speak");
    }
}
