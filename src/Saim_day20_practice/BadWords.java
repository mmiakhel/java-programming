package Saim_day20_practice;
/*
Given a String variable with a message.
You will check if the message contains any of these bad words: “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”
 */

public class BadWords {
    public static void main(String[] args) {
        String badWords = "what the heck are you doing, dumb idiot!";

        if(badWords.contains("idiot") || badWords.contains("dumb") || badWords.contains("heck")) {
            System.out.println("Message not sent");
        } else {
            System.out.println("Message sent");
        }

    }
}
