package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно". 
3. Вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
      String[] strings = {"мама", "мыла", "раму"};
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < strings.length; i++){
            list.add(strings[i]);
        }
        for (int i = 0; i < list.size(); i++){
            list.add(i + 1, "именно");
            i++;
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
