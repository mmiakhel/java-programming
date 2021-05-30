package day43_list_custom_classes;
//purpose of creating a template class: to use and reuse objects
//only 1 class can be public (cannot have more than 1 public class in a class)
public class Person {
    //Data -> variables
    String firstName;
    int age;
    char gender;
    //behaviour -> method
    public void speak() {
        System.out.println("Person is speaking");
    }
}

class People {
    public static void main(String[] args) {
        //creat object of Person class-->Instantiate Person class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 12;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

        System.out.println("person1.firstName = " + person1.firstName);

    }
}
