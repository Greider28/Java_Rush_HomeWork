package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
Создать массив на 20 чисел. Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве. Вывести на экран максимальное и минимальное числа через пробел.

1. В классе Solution создай статический публичный метод int[] getInts().
2. Метод  getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
3. В методе main создай и проинициализируй массив с помощью метода getInts(), найди и выведи через пробел макс и мин элемент массива
4. Используй цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
      int[] nums = getInts();
        maximum = nums[0];
        minimum = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > maximum){
                maximum = nums[i];
            }
            if (nums[i] < minimum){
                minimum = nums[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
  public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }
}
