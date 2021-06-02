package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("Message: " + message);
        //System.out.println("Num = " + num); //ERROR: b/c int above is not static, it is instance variable (both have to be static to use it)
        System.out.println("Count = " + count); //no error, count is static variable
    }

    public static void anotherStaticMethod() {
        System.out.println("Another static method example");
        displayMessage("Wooden Spoon"); //both methods static that's why able to use it
    }

    //StaticMethods.instanceMethod(); --> will not work
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod() {
        System.out.println("Instance method");
        System.out.println("Num = " + num);
        System.out.println("Count = " + count);
        displayMessage("Hello from instance method");
    }

}
