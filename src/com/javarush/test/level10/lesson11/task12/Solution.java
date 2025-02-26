package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
Программа вводит с клавиатуры пару (число и строку) и выводит их на экран. Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
Ключевые требования: 
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран. Каждую пару - с новой строки.
Пример ввода: 
1 
Мама
2 
Рама
1
Мыла
Пример вывода:
1 Мыла 
2 Рама 
1 Мама
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        int id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.println("Id=" + id + " Name=" + name);
        */
         HashMap<String, Integer> mapOfNumAndString = new HashMap<>();


        while(true){
            String idStr = reader.readLine();
            if (idStr.equals("")){
                break;
            } else {
                int id = Integer.parseInt(idStr);
                String name = reader.readLine();
                if (mapOfNumAndString.containsKey(name)){
                    System.out.println("Please, enter another String");
                    name = reader.readLine();
                    mapOfNumAndString.put(name, id);
                } else {
                    mapOfNumAndString.put(name, id);
                }

            }
        }

        for (Map.Entry<String, Integer> pair: mapOfNumAndString.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
