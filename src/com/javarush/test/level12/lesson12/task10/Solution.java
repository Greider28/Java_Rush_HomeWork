package com.javarush.task.task12.task1230;

/* 
Попадание в десятку
Добавь еще один метод, чтобы программа выводила на экран число 10.
Подсказка: используй перегрузку методов.
*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }
  //делаем перегрузку
  public static int transformValue(Integer i){
        return i * 2;
    }
}

