package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        //index:  0       1          2        3          4
                //id, firstName, lastName, batchNum, phoneNum
        //long way
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Mike";
        student1[2] = "Bloomberg";
        student1[3] = "B22";
        student1[4] = "703-432-1234";

        //short/common way
        String[] student2 = {"1234", "Muzdalifa", "Miakhel", "B22", "703-123-4567"};

        System.out.println("ID Number:\t\t" + student1[0]);
        System.out.println("First Name:\t\t" + student1[1]);
        System.out.println("Last Name:\t\t" + student1[2]);
        System.out.println("Batch Number:\t" + student1[3]);
        System.out.println("Phone Number:\t" + student1[4]);
        System.out.println();
        System.out.println("ID Number:\t\t" + student2[0]);
        System.out.println("First Name:\t\t" + student2[1]);
        System.out.println("Last Name:\t\t" + student2[2]);
        System.out.println("Batch Number:\t" + student2[3]);
        System.out.println("Phone Number:\t" + student2[4]);

        System.out.println("Student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("Pass: data array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }

        if (student1.length == student2.length) {
            System.out.println("Pass: data arrays length match");
        } else {
            System.out.println("Fail: data arrays length mismatch");
        }

        //ready from array and print first and last name in upper case
        System.out.println(student2[1].toUpperCase() +  " " + student2[2].toUpperCase());

        //read phone num from array and store into variable
        String phoneNum = student1[4];




    }
}
