package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        //создаем 9 разных объектов типа Humman (4 объекта без отца и матери и 5 объектов с ними)
        Human grandFather = new Human("Иван", true, 67);
        Human grandMother = new Human("Ганна", false, 63);
        Human grandFather1 = new Human("Петр", true, 70);
        Human grandMother1 = new Human("Анна", false, 43);
        Human father = new Human("Василий Иванович", true, 60, grandFather, grandMother);
        Human mother = new Human("Александа Петровна", false, 58, grandFather1, grandMother1);
        Human san = new Human("Василий Всильевич", true, 34, father, mother);
        Human daughter = new Human("Анна Васильевна", false, 26, father, mother);
        Human dog = new Human("Берта", false, 4, father, mother);
        //выводим все объекты на экран
        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(san);
        System.out.println(daughter);
        System.out.println(dog);
    }

    public static class Human {
        // напишите тут ваш код
        //создаем переменные класса
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        //создаем два конструктора
        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}