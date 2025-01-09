package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
1. Создай список строк. 
2. Добавь в него 5 различных строк. 
3. Выведи его размер на экран. 
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
      ArrayList<String> list = new ArrayList<String>();
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");
        list.add("string5");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

