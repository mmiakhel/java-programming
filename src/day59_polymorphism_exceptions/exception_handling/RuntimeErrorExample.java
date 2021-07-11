package day59_polymorphism_exceptions.exception_handling;

/**
 * RUNTIME EXCEPTION --> happens in below code
        *code compiles fine but during execution it fails
        *throws: ArithmeticException (cannot divide by 0)
 */
public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10 / 2);
        System.out.println(10 / 0);
        System.out.println(10 / 3);
    }
}
