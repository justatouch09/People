package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person> people = new ArrayList<>();

        File f = new File("people.csv");
        new FileReader("people.csv");
        Scanner fileScanner = new Scanner(f);
        fileScanner.nextLine();

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split(",");
            Person person = new Person(Integer.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
            people.add(person);
    }
        Collections.sort(people);
        System.out.print(people);

    }
}
