package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {

        String message = "Sender: [ Saim ] From Number<(222)333-4444> " +
                "Message:{Hello, lets code some java}";

        int open = message.indexOf("[");
        int close = message.indexOf("]");
        System.out.println(message.substring(open + 1, close));
        String sender = message.substring(open + 1, close);
        System.out.println("sender = " + sender);

        String mobile = message.substring(message.indexOf("<") +1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{") +1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println(" Fikret    ".trim());
        sender = sender.trim();
        if(sender.equals("Saim")) {
            System.out.println("Message from Saim about homework");
        } else {
            System.out.println("Someone else");
        }



    }
}
