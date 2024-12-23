package com.javarush.task.task06.task0613;

/* 
Кот и статика
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1.
Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
      /*Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        */
        for (int i = 0; i < 10; i++){
            new Cat();
        }

        // Выведи значение переменной catCount
       System.out.println(Cat.catCount);
    }

    public static class Cat {
        // Создай статическую переменную catCount
      public static int catCount;

        // Создай конструктор
      public Cat(){
            Cat.catCount++;
        }
    }
}
