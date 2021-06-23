package mentor_session_questions;

public class SwapTwoVariables {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "spoon";

        System.out.println("Before swap: " + word1 + " " + word2);

        word1 = word1 + word2;
        System.out.println("Concatenated strings: " + word1);

        word2 = word1.substring(0, word1.length() - word2.length());
        word1 = word1.substring(word2.length());

        System.out.println("After swap: " + word1 + " " + word2);
    }
}
