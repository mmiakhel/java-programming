package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
        for(int min = 1; min <= 10; min++) {
            System.out.println("\nmin = " + min);
            for(int sec = 1; sec <= 60; sec++){
                System.out.print(sec + " ");
            }
        }


        /**
         * 0:1
         * 0:2 ...
         * 1:0
         * 1:1 ...
         */
        for(int min = 0; min <= 4; min++) {
            for(int sec = 0; sec < 60; sec++){
                System.out.println(min + ":" + sec);
            }

        }
    }
}
