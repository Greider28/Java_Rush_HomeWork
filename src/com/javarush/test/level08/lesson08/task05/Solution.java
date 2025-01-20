package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
      Map<String, String> map = new HashMap<String, String>();
        map.put("Sal", "Alex");
        map.put("Sal2", "Alex15");
        map.put("Sal3", "Alex2");
        map.put("Sal4", "Alex2");
        map.put("Sal5", "Alex3");
        map.put("Sal6", "Alex3");
        map.put("Sal7", "Alex4");
        map.put("Sal8", "Alex4");
        map.put("Sal9", "Alex5");
        map.put("Sal10", "Alex56");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
      Map<String, String> newMap = new HashMap<>(map);

        for (Map.Entry<String, String> pair : newMap.entrySet()){
            if (map.containsValue(pair.getValue())){
                map.remove(pair.getKey());
                if (map.containsValue(pair.getValue())){
                    removeItemFromMapByValue(map, pair.getValue());
                } else {
                    map.put(pair.getKey(), pair.getValue());
                }

            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
