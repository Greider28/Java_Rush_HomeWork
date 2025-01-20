package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
      Map<String, Integer> map = new HashMap<>();
        map.put("Sal1", 100);
        map.put("Sal2", 200);
        map.put("Sal3", 300);
        map.put("Sal4", 400);
        map.put("Sal5", 500);
        map.put("Sal6", 600);
        map.put("Sal7", 700);
        map.put("Sal8", 800);
        map.put("Sal9", 900);
        map.put("Sal10", 1000);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
      Map<String, Integer> newMap = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : newMap.entrySet()){
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
