package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
Унаследуй классы Cat и Dog от Pet. Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat {

    }
  /*
  public static class Cat extends Pet{
        public String getName(){
            return "cat name";
        }
        public Pet getChild(){
            return new Cat();
        }

    }
  */

    public static class Dog {

    }
  /*
  public static class Dog extends Pet{
        public String getName(){
            return "dog name";
        }
        public Pet getChild(){
            return new Dog();
        }

    }
  */

}
