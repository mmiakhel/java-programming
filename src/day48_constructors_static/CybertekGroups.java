package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        //dependency injection. Group object creation depends on String name
        Group group1 = new Group("Cyberbugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMembers("Berk");
        group1.addMembers("Pavel");
        group1.addMembers("Elvin");
        group1.addMembers("Ali");
        group1.addMembers("Parvin");
        group1.addMembers("Rasim");
        group1.addMembers("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Akrem", "Bulent", "Andrea", "Andrei"));
        //print all members. not toString()
        System.out.println("Group2 members = " + group2.getMembers());
        //use if statement to check if Akrem is in group2
        if(group2.getMembers().contains("Akrem")) {
            System.out.println("Akrem is in group2");
        } else {
            System.out.println("Akrem is not in group2");
        }

        //remove some members from group1
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1);





    }
}
