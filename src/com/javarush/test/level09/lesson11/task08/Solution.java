package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно. 
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
      ArrayList<int[]> list = new ArrayList<>();
        int[] arr1 = {1, 2, 3, 4, 5};
        list.add(arr1);
        int[] arr2 = {1, 2};
        list.add(arr2);
        int[] arr3 = {1, 2, 3, 4};
        list.add(arr3);
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7};
        list.add(arr4);
        int[] arr5 = new int[0];
        list.add(arr5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
