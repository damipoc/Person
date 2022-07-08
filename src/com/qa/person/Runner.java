package com.qa.person;

import java.util.*;

public class Runner {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        //Adding objects
        Person person = new Person();
        Person personOne = new Person("Bob", 21, "Chef");
        Person personTwo = new Person("Jeff", 26, "Mechanic");
        Person personThree = new Person("Anna", 30, "Nurse");

        //Adding people to the list array
        person.addPerson(personOne);
        person.addPerson(personTwo);
        person.addPerson(personThree);

        //Scan for the name
        System.out.println("Who do you want to find?");
        String scanName = scan.nextLine();

        //Convert to lowercase and first letter uppercase
        scanName = scanName.toLowerCase();
        scanName = scanName.substring(0, 1).toUpperCase() + scanName.substring(1);

        //Searches for the name inputted
        System.out.println("Searching for: " + scanName);
        person.findPerson(scanName);

        //Outputs the people list
        person.printPeople();
        scan.close();

    }
}
