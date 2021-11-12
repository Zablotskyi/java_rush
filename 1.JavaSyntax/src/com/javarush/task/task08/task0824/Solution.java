package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("child1", true, 6);
        Human child2 = new Human("child2", false, 7);
        Human child3 = new Human("child3", true, 8);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human("Wasyl", true, 34, children);
        Human mother = new Human("Oksana", false, 36, children);
        ArrayList<Human> fath = new ArrayList<>();
        fath.add(father);
        ArrayList<Human> moth = new ArrayList<>();
        moth.add(mother);

        Human grandfather1 = new Human("Wasyl", true, 60, fath);
        Human grandmother1 = new Human("Shura", false, 58, fath);
        Human grandfather2 = new Human("Marina", true, 63, moth);
        Human grandmother2 = new Human("Walerii", false, 68, moth);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }
        public Human (String name, boolean sex, int age) {
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
