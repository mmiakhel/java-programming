package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        //void can not do anything else except print (no actions)
        loginVoid("cybertekstudent", "abc123"); //POSITIVE TEST = Sunny day
        loginVoid("cybertekstudends", "123abc"); //NEGATIVE TEST = Rainy day scenario
        loginVoid("","");
        //System.out.println(loginVoid("cybertekstudent", "abc123")); //error-b/c void--no return value


        //non-void can do all of these different cations
        System.out.println(login("cybertekStudent", "abc123"));

        if(login("cybertekStudent", "abc123")) {
            System.out.println("Login successfull, welcome to Canvas!");
            System.out.println("Select the course to continue");
        } else {
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course or calendar");
        } else {
            System.out.println("Something wrong with your credentials");
        }


        System.out.println(login("cybertekstudents", "abcd1234"));

    }

    public static void loginVoid(String username, String password) {
        String secretUsername  = "cybertekStudent";
        String secretPassword = "abc123";

        if(username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login successful, welcome CybertekStudent!");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String userName, String password) {
        String secretUsername  = "cybertekStudent";
        String secretPassword = "abc123";
//     can use the below commented out statement without the if statement and will return because it is a boolean condition and it is true
        //if(userName.equalsIgnoreCase((secretUsername)) && password.equals(secretPassword));
        if(userName.equalsIgnoreCase((secretUsername)) && password.equals(secretPassword)) {
            return true; //return true and exit method here
        } else { //can omit this else
            return false; //when the else is omitted, if if statement is not correct then it will return false
        }
    }











}
