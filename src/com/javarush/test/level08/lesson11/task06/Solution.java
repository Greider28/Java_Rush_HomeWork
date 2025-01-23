package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
      Human son1 = new Human("Alex", true, 18);
        System.out.println(son1.toString());
        Human son2 = new Human("Miron", true, 8);
        System.out.println(son2.toString());
        Human daughter = new Human("Alisa", false, 5);
        System.out.println(daughter.toString());
        ArrayList<Human> childParents = new ArrayList<Human>();
        childParents.add(son1);
        childParents.add(son2);
        childParents.add(daughter);
        Human mother = new Human("Irina", false, 54, childParents);
        System.out.println(mother.toString());
        Human father = new Human("Valera", true, 52, childParents);
        System.out.println(father.toString());
        ArrayList<Human> childGrandparentsFather = new ArrayList<Human>();
        childGrandparentsFather.add(father);
        ArrayList<Human> childGrandparentsMother = new ArrayList<Human>();
        childGrandparentsMother.add(mother);
        Human grandfatherFather = new Human("Petr", true, 84, childGrandparentsFather);
        System.out.println(grandfatherFather.toString());
        Human grandmotherFather = new Human("Vasilisa", false, 80, childGrandparentsFather);
        System.out.println(grandmotherFather.toString());
        Human grandfatherMother = new Human("Jack", true, 86, childGrandparentsMother);
        System.out.println(grandfatherMother.toString());
        Human grandmotherMother = new Human("Kary", false, 81, childGrandparentsMother);
        System.out.println(grandmotherMother.toString());
    }

    public static class Human {
        //напишите тут ваш код
      String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>(0);
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
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
