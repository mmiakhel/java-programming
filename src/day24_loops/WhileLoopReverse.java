package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
//        int count = 5;
//        while(count >= 0) {
//            System.out.println("count = " + count);
//            count--;
//        }
//        System.out.println("Finished the count");

        /**
         * read each message 1 by 1 until you have 0 unread SMS
         * while unreadSMS is more than 0, read one by one
         */
        int unreadSMS = 10;
        System.out.println("I have a total of " + unreadSMS + " unread SMS");

        while(unreadSMS > 0) {
            System.out.println("Reading SMS: " + unreadSMS);
            unreadSMS--;
        }
        System.out.println("No more unread SMS");




    }
}
