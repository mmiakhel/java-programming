package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 1234;
        int pinCode = 4321;

        int expLast4SSN = 1234;
        int expPinCode = 4921;

        if(last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if(last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN does not match");
            }
            if (expPinCode != pinCode) {
                System.out.println("Pin Code is incorrect");
            }

        }


        //when both match = "Authentication successful"
        //when expLast4SSN does not match = "Last 4 of SSN did not match"
        //when pinCode does not match = "Pincode did not match"

    }
}
