package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
Напиши public класс Human (человек) и public интерфейсы CanRun (бежать/ездить), CanSwim(плавать).
Добавь в каждый интерфейс по oдному методу. Добавь эти интерфейсы классу Human, но не реализуй методы. Объяви класс Human абстрактным.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
  public interface CanRun {
        void run();
    }
    public interface CanSwim {
        void swim();
    }
    public abstract class Human implements CanRun, CanSwim {

    }
}
