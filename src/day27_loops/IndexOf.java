package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'o';
        int index = -1;
        //using for loop: if charAt(i) matches letter store the i value into index.
        //then print "i is found at index 1"

        for(int i = 0; i < word.length(); i++) {
           // System.out.println(i + " - " + word.charAt(i));
            if(word.charAt(i) == letter) {
                index = i;
                System.out.println(letter + " is found at index " + index);
                break; //exit for loop
            }
        }
        if(index == -1) {
            System.out.println(letter + " is not present");
        }
    }
}
