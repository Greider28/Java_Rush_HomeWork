package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
Перехватить исключение, возникающее при выполнении кода: int a = 42 / 0; Вывести на экран тип перехваченного исключения.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
      try
        {

        int a = 42 / 0;

        //напишите тут ваш код
          }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
