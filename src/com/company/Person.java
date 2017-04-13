package com.company;

/**
 * Created by jaradtouchberry on 4/11/17.
 */
public class Person implements Comparable {
    int id;
    String firstName;
    String lastName;
    String email;
    String country;
    String ipAddress;

    public Person(int id, String firstName, String lastName, String email, String country, String ipAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.ipAddress = ipAddress;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person)o;

        return lastName.compareTo(p.lastName);
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}


