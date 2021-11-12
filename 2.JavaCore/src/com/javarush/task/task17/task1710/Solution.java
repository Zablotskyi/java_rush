package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
        switch (args[0]) {
            case "-c" : {
                Date date = parser.parse(args[3]);
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], date));
                } else {
                    allPeople.add(Person.createFemale(args[1], date));
                }
                System.out.println(allPeople.size() - 1);
                break;
            }
            case "-u" : {
                Date date = parser.parse(args[4]);
                int id = Integer.valueOf(args[1]);
                allPeople.remove(id);
                if (args[3].equals("м")) {
                    allPeople.add(Person.createMale(args[2], date));
                } else {
                    allPeople.add(Person.createFemale(args[2], date));
                }
                break;
            }
            case "-d" : {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setBirthDate(null);
                person.setSex(null);
                break;
            }
            case "-i" : {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                Person person = allPeople.get(Integer.parseInt(args[1]));
                if (person.getSex() == Sex.MALE) {
                    System.out.println(person.getName() + " " + "м" + " " + dateFormat.format(person.getBirthDate()));
                }
                else {
                    System.out.println(person.getName() + " " + "ж" + " " + dateFormat.format(person.getBirthDate()));
                }
                break;
            }
        }
    }
}
