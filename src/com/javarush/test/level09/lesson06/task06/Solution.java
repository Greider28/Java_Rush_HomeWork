package com.javarush.task.task09.task0912;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int num=Integer.parseInt("XYZ"); System.out.println(num);
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
      try {

            int num = Integer.parseInt("XYZ");
            System.out.println(num);

            //напишите тут ваш код
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
