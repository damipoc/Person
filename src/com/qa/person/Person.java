package com.qa.person;

import java.util.*;

public class Person {

    private String name;
    private int ages;
    private String jobTitle;
    private List<Object> peopleList = new ArrayList<Object>();

    public Person() {

    }

    public Person(String name, int ages, String jobTitle) {
        this.name = name;
        this.ages = ages;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", ages=" + ages + ", jobTitle=" + jobTitle + "]";
    }

    // Adds person to the people list
    public void addPerson(Person person) {
        peopleList.add(person);
    }

    // Foreach loop that outputs the entire list
    public void printPeople() {

        System.out.println("Printing everyone.");

        for (Object p : peopleList) {
            System.out.println(p);
        }
    }

    // Foreach loop that converts each person into a string and then checks
    // if the string contains the name given, if the loop ends without a find it
    // outputs a 404 message
    public void findPerson(String name) {

        for (Object p : peopleList) {
            String s = p.toString();
            if (s.contains(name)) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Sorry, this name does not exist");
    }

}
