package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>(); String s = list.get(18);
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
      try {

            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);

            //напишите тут ваш код
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
