package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result2 = new HashSet<>();
        result2.add(new Dog());
        result2.add(new Dog());
        result2.add(new Dog());

        return result2;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> result3 = new HashSet<>();
        result3.addAll(cats);
        result3.addAll(dogs);
        return result3;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()) {
            if (cats.contains(iterator.next()))
                iterator.remove();
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object pet: pets) {
            System.out.println(pet);
        }
    }

    //напишите тут ваш код
    public static class Cat {
        public Cat() {
        }
    }
    public static class Dog {
        public Dog() {
        }
    }
}
