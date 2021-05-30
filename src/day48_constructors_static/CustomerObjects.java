package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1); //print with default values that are set in no-args constructor
        cs1.setId(1);
        cs1.setName("Muz");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2); //create object and assign values in same statement
        Customer cs3 = new Customer("John Ward", 3);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 449));
        customerList.add(new Customer("Suleyman", 763));
        customerList.add(new Customer("Muzdalifa", 748));

        //print info of first customer object in array and arraylist.
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());

        System.out.println(customerList);  //print toString() info of all Customer objects
        System.out.println("\n-------- FOR LOOP --------");
        for(int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        System.out.println("\n-------- FOR Each --------");
        for(Customer eachCustomer : customerList) {
            System.out.println(eachCustomer);
        }

        //print all names of Customers in the list
        System.out.println("\n-------- NAMES OF CUSTOMERS USING LAMBDA EXPRESSION --------");
        customerList.forEach(each -> System.out.println(each.getName()));

        System.out.println("\n-------- NAMES OF CUSTOMERS USING FOR EACH LOOP --------");
        for(Customer eachCustomer : customerList) {
            System.out.println(eachCustomer.getName());
        }


    }
}
