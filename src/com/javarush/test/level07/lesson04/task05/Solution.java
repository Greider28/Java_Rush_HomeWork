package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый. 
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький. 
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];

        for (int i = 0; i < numbers.length / 2; i++){
            numbers1[i] = numbers[i];
            numbers2[i] = numbers[i + numbers.length / 2];
            System.out.println(numbers2[i]);
        }
    }
}
