package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23, 45, 23, 54, 23, 45, 3, 455, 33, 223, 56, 7, 4, 78, 89, 12, 1, 22);
        addNumbers();

        //int... myNumber = 10, 4; ERROR: var-args can ONLY be used as a method parameter
    }



    //varargs
    public static void addNumbers(int... nums) {
        //inside the method, it is used as regular array
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
