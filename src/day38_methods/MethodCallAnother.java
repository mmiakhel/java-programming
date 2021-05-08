package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        start();
        continues();
        end();

    }

    public static void start() {
        System.out.println("Start");
        continues();
    }
    public static void continues() {
        System.out.println("Continue");
        end();
    }
    public static void end() {
        System.out.println("End");
        //start();
    }








}
