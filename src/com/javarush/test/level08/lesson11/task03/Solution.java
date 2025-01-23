package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами. 
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код

        Map<String, String> map = new HashMap<String, String>();
        map.put("lastname1", "firstname1");
        map.put("lastname2", "firstname1");
        map.put("lastname3", "firstname1");
        map.put("lastname4", "firstname2");
        map.put("lastname5", "firstname3");
        map.put("lastname6", "firstname4");
        map.put("lastname7", "firstname5");
        map.put("lastname8", "firstname6");
        map.put("lastname9", "firstname7");
        map.put("lastname1", "firstname8");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
