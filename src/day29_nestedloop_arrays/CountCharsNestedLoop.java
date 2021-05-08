package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for(int outer = 0; outer < word.length(); outer++) {
            System.out.println("outer: " + word.charAt(outer));
            //char outerchar = word.charAt(outer);
            int count = 0; //reset count to 0
            for(int inner = 0; inner < word.length(); inner++) {
               // char innerChar = word.charAt(inner);
               // if(outerchar == innerChar) {
                if(word.charAt(outer) == word.charAt(inner)) {
                    count++;
                }
            }
            System.out.println(word.charAt(outer) + "=" + count);
            //System.out.println();
        }
    }
}
