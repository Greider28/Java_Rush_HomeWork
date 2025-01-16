package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание: 
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя 
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня ...
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
      Human one = new Human("Аня", false, 59);
        Human two = new Human("Валера", true, 64);
        Human three = new Human("Ира", false, 65);
        Human four = new Human("Степан", true, 70);
        Human five = new Human("Алекс", true, 25, two, one);
        Human six = new Human("Марина", false, 27, four, three);
        Human seven = new Human("Джек", true, 20, two, three);
        Human eight = new Human("Катя", false, 21, four, one);
        Human nine = new Human("Мирон", true, 19, two, one);
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());
        System.out.println(five.toString());
        System.out.println(six.toString());
        System.out.println(seven.toString());
        System.out.println(eight.toString());
        System.out.println(nine.toString());
    }

    public static class Human {
        // напишите тут ваш код
      String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
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
