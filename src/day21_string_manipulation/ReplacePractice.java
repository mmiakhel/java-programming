package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub", "lab");
        System.out.println("word = " + word);

        //gitlab
        //change i -> o and a -> i ==> gotlib
      //  System.out.println(word.replace('i','o').replace('a','i'));
        System.out.println(word.replace("i","o").replace("a","i"));

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ","");
        System.out.println("withNoSpace = " + withNoSpace);
        System.out.println(sentence.replace(" ",""));
        sentence = sentence.replace("java","selenium")
                           .replace("fun","a lot of fun");

        String results = "1-48 of over 4,000 results for java book";
        results = results.replace("1-48 of over ","")
                         .replace(",","")
                         .replace(" results for java book","");
        System.out.println("results = " + results);

        int count = Integer.parseInt(results);


    }
}
