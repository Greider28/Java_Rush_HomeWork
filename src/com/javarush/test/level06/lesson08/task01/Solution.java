package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

public class Cat {
    //напишите тут ваш код
    //start my code
  static int catCount;
    public Cat(){
        Cat.catCount++;
    }
    //end my code

    public static void main(String[] args) {

    }
}
