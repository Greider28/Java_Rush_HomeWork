package com.javarush.task.task05.task0527;

/* 
Том и Джерри
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример: Mouse jerryMouse = new Mouse("Jerry", 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Dog snoopyDog = new Dog("Snoopy", 4, 8);
        Cat tomCat = new Cat("Tom", 3, 6);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
  public static class Dog {
        String name;
        int age;
        int weight;

        public Dog (String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    public static class Cat {
        String name;
        int age;
        int height;

        public Cat (String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }
}
