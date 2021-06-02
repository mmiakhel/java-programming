package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student(); //runs no-args constructor
        Student st2 = new Student(); //runs no-args constructor

        Student st3 = new Student("Muz");
        Student st4 = new Student("Najib");

        Student st5 = new Student(30);

        Student st6 = new Student("Muz", 30);

    }

}
