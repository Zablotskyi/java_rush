package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granddadName = reader.readLine();
        Cat catGranddad = new Cat(granddadName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGranddad);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println("The cat's name is " + granddadName + ", no mother, no father");
        System.out.println("The cat's name is "+ grandmotherName + ", no mother, no father");
        System.out.println("The cat's name is " + fatherName + ", no mother, father is " + granddadName);
        System.out.println("The cat's name is " + motherName + ", mother is " + grandmotherName + ", no father");
        System.out.println("The cat's name is " + sonName + ", mother is " + motherName + ", father is " + fatherName);
        System.out.println("The cat's name is " + daughterName + ", mother is " + motherName + ", father is " + fatherName);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        public Cat(String daughterName, Cat catMother) {
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "Cat name is " + name + ", no mother, no father ";
            else if (mother == null )
                return "Cat name is " + name + ", no mother, father is "+father.name;
            else if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name+", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name +" father is "+father.name;
        }
    }

}
