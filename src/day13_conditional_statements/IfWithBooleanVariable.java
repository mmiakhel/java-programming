package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        //if (isHungry = false){ //this will work also
        //if (isHungry == false){ //this will work also
        if (isHungry){ //shortcut, preferred way
            System.out.println("I am hungry I will go get something to eat\n" +
                    "then code java");
        } else {
            System.out.println("I am not hungry, let's keep coding java.");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0; //200 is budget

        System.out.println("isAffordable = " + isAffordable);

        if (isAffordable) {
            System.out.println("I can afford it, let's buy it!");
        } else {
            System.out.println("Too expensive, let's keep coding java");
        }


        boolean isRemoteJob = true;
        //if it's NOT a remoteJob print "Sorry, I am not interested."
        //otherwise, print "Sure, I am interested. What is the interview process?"
        //if (isRemoteJob != true) { //long way.

        if (!isRemoteJob) {
            System.out.println("Sorry, I am not interested.");
        } else {
            System.out.println("Sure, I am interested. What is the interview process?");
        }




    }
}
