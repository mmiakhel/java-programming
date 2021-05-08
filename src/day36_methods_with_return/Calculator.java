package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2, 20.0));
        double sum = add(1, 3);
        System.out.println("Sum = " + sum);
        System.out.println("100.0 + 200.0 = " + add(100, 200));
        System.out.println(minus(10.5, 3.5));
        System.out.println(multiply(2.0, 10.0));
        System.out.println(divide(10.0, 5.0));

    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;  //or return num1 + num2;
    }
    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }
    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}
