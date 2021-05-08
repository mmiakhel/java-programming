package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char alphabet = 'a';
        while(alphabet <= 'z') {
            System.out.print(alphabet + " ");
            alphabet++;
        }
        System.out.println();
        //print alphabet in reverse order

        alphabet = 'z';
        while(alphabet >= 'a') {
            System.out.print(alphabet + " ");
            alphabet--;
        }
    }
}
