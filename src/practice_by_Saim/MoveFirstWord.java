package practice_by_Saim;
/*
[Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex:
input: Java is a fun language
output: is a fun language Java
Hint: Use indexOf and substring
 */

public class MoveFirstWord {
    public static void main(String[] args) {
        String sentence = "Java is a fun language";
        int indexOfFirstSpace = sentence.indexOf(" ");
        String firstWord = sentence.substring(0,indexOfFirstSpace);
        System.out.println(sentence.substring(indexOfFirstSpace + 1) + " " + firstWord );


    }
}
