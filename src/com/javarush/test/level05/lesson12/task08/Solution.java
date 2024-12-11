package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
Написать программу, которая: 
1. считывает с консоли число N, которое должно быть больше 0 
2. потом считывает N чисел с консоли 3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int maximum = ;//remove line, it will be later
        int n = Integer.parseInt(reader.readLine());//but add this line for N

        //напишите тут ваш код
      if (n > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            for (int i = 1; i < n; i++){
                int enterNum = Integer.parseInt(reader.readLine());
                maximum = (maximum >= enterNum) ? maximum : enterNum;
            }
            System.out.println(maximum);
        }

        //System.out.println(maximum);//remove this line, because it will be in IF, we have check for >0
    }
}
