package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс перестал быть абстрактным. Добавлять/реализовывать методы в классе CTO запрещается.
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

  //  
  public static class CTO implements Businessman {

    }
  /*
  public static class CTO extends Human implements Businessman {

    }
    public static class Human implements Businessman {
        public void workHard(){

        }
    }
  */
}
