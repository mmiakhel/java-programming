package day32_arrays_split;
import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
        //interview question (java is fun = fun is java; wood spoon search == search spoon wooden)
        String sentence = "today is java";
        String[] words = sentence.split(" ");
        String reversed = "";
        //print words array in reverse order
        for(int i = words.length-1; i >= 0; i--) {
           // System.out.println(words[i] + " ");
            reversed += words[i] + " ";
        }
        System.out.println("Sentence = " + sentence);
        System.out.println("Reversed = " + reversed.trim());


    }
}
