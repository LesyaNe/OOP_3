package org.example;

public class Main {
    public static void main(String[] args) {
        Person per1 = new Person;
        Person per2 = new Person;
        Person per3 = new Person;
        Person per4 = new Person;
        Person per5 = new Person;


        System.out.println("Parent('s): ");
        for (Person person : per2.getParents()) {
            System.out.println(person.toString());
        }

        System.out.println("Children are: ");
        for (Person person : per3.getChildren()) {
            System.out.println(person.toString());
        }

        System.out.println("Subparents are: ");
        for (Person person : per3.getSubParents()) {
            System.out.println(person.toString());
        }

        System.out.println("Subchildren are: ");
        for (Person person : per3.getSubChildren()) {
            System.out.println(person.toString());
        }
    }

}
