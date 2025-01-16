package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
      Integer[] newArr = new Integer[array.length];
        for (int i = 0; i < array.length; i++){
            newArr[i] = array[i];
        }
        Arrays.sort(newArr, Collections.reverseOrder());
        for (int i = 0; i < newArr.length; i++){
            array[i] = newArr[i];
        }
        //суть подхода в том, что сначала создаем массив в Integer так как метод коллекции работает именно с таким типом оберткой, записываем циклом в него все значения из нашего int массива
        //делаем обратную сортировку с помощью доп метода reverseOrder, после чего присваиваем нашему int масиву отсортированные в обратном порядке данные из Integer массива циклом
    }
}
