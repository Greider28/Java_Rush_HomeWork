package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
1. В методе initializeArray():
1.1. Создай массив на 20 чисел 
1.2. Считай с консоли 20 чисел и заполни ими массив 
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        
        return null;
      //start my code
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        return numbers;
      //end my code
    }

    public static int max(int[] array) {
        // найди максимальное значение
        return 0;
      //start my code
      int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxNum){
                maxNum = array[i];
            }
        }
        return maxNum;
      //end my code
    }
}
