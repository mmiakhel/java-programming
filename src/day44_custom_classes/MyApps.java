package day44_custom_classes;

/**
 * this class is used to create Objects of App class
 */

public class MyApps {
    public static void main(String[] args) {
        App uberApp = new App(); //creating new object
        uberApp.open(); //call open method using object variable
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open(); //call open method using object variable

        uberApp.version = 4.0;
        uberApp.open(); //open new version

        /**
         * create more objects and practice
         *
         */
    }
}
