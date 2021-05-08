package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;

        //For loop: read each character(charAt(i)) and test if it matches letter
        //if it matches, add 1 to count
        //outside the loop: print the count

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println(count);
    }
}
