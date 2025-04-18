package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры. 
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Alex", 34, "Dnipro city");
        Man man2 = new Man("Andrey", 34, "Pavlograd city");

        Woman woman1 = new Woman("Helen", 34, "Dnipro city");
        Woman woman2 = new Woman("Maryna", 34, "Little town in Poland");

        System.out.println( man1.name + " " + man1.age + " " + man1.address);
        System.out.println( man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //напишите тут ваш код
  public static class Man {
        String name;
        int age;
        String address;
         public Man (String name, int age, String address) {
             this.name = name;
             this.age = age;
             this.address = address;
         }
    }

    public static class Woman {
        String name;
        int age;
        String address;
        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
