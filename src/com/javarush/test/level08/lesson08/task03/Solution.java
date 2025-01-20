package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя". 
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
      Map<String, String> map = new HashMap<String, String>();
        map.put("a1", "b1");
        map.put("a2", "b1");
        map.put("a3", "b2");
        map.put("a4", "b2");
        map.put("a5", "b3");
        map.put("a6", "b3");
        map.put("a7", "b4");
        map.put("a8", "b4");
        map.put("a9", "b5");
        map.put("a10", "b1");

        return map;

    }
  
  /*
    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); //подключаем итератор
    while (iterator.hasNext())
    {
        //получение «пары» элементов
        Map.Entry<String, String> pair = iterator.next();
        String key = pair.getKey();            //ключ
        String value = pair.getValue();        //значение
        System.out.println(key + ":" + value);
    }
     */

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
      int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)){
                count++;
            }

        }

        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
      int count = 0;
        if (map.containsKey(lastName)){
            count = 1;//первый объект в паре, называемый ключом, должен быть уникальным. В Map не может содержаться две пары с одинаковыми ключами.
        }
        return count;

    }

    }

    public static void main(String[] args) {

    }
}
