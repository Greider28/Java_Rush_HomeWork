package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
Создай массив, элементами которого будут списки строк. Заполни массив любыми данными и выведи их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] array = new ArrayList[3];
        ArrayList<String> list1 = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            list1.add("abc");
        }
        for (int i = 0; i < array.length; i++){
            array[i] = list1;
        }

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
