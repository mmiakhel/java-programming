package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" "); //each one is split into word array now
        System.out.println("1st word = " + words[0]);
        System.out.println("2nd word = " + words[1]);
        System.out.println("3rd word = " + words[2]);
       // System.out.println("4th word = " + words[3]); //no 4th word, so will give outofboundserror
        //can loop as well
        for(String w : words) {
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] results = googleResult.split(" ");
        System.out.println("Count = " + results[1]);
        System.out.println("Seconds = " + results[3].replace("(" , ""));
        //or
        System.out.println("Seconds = " + results[3].substring(1));






    }
}
