package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
1. В классе Solution создать public static класс Idea. 
2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку. 
3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //напишите тут ваш код
  //start my code
  public static class Idea{
        public String getDescription(){
            return "string to return";
        }
    }
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
  //end my code
}
