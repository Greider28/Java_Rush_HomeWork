package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Смирнов2", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирнов3", dateFormat.parse("JULY 1 2012"));
        map.put("Смирнов4", dateFormat.parse("AUGUST 1 2012"));
        map.put("Смирнов5", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Смирнов6", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Смирнов7", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Смирнов8", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирнов9", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирнов10", dateFormat.parse("JULY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> mapNew = new HashMap<>(map);
        Iterator<Map.Entry<String, Date>> iterator = mapNew.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();
            Date value = pair.getValue();
            if (value.getMonth() > 4 && value.getMonth() < 8){
                map.remove(key);
            }
        }

    }

    public static void main(String[] args) {

    }
}
